package com.syohex.simplehttp

import java.io.InputStream
import java.util.*

class HttpHeader {
    private val input: InputStream
    private lateinit var method: HttpMethod
    lateinit var path: String

    constructor(input: InputStream) {
        this.input = input

        parseRequestLine(input)
    }

    private fun parseRequestLine(input: InputStream) {
        val line = input.bufferedReader().use { it.readLine() } ?: throw InvalidRequestException("cannot read request")
        val parts = line.split(" ")
        if (parts.size < 2) {
            throw InvalidRequestException("Invalid request line")
        }

        method = toMethod(parts[0])
        path = parts[2]
    }

    private fun parseRequestHeader(input: InputStream) {

    }

    private fun toMethod(methodStr: String): HttpMethod {
        return when (methodStr.uppercase(Locale.getDefault())) {
            "GET" -> HttpMethod.GET
            "POST" -> HttpMethod.POST
            "PUT" -> HttpMethod.PUT
            "DELETE" -> HttpMethod.DELETE
            "PATCH" -> HttpMethod.PATCH
            else -> throw InvalidRequestException("Invalid method: '$methodStr'")
        }
    }
}