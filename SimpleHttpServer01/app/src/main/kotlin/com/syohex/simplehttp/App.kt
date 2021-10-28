package com.syohex.simplehttp

import java.lang.NumberFormatException

fun main(args: Array<String>) {
    if (args.isEmpty()) {
        println("please specify port number")
    }

    try {
        val port = args[0].toInt()
        val server = HttpServer(port)
        server.start()
    } catch (e: NumberFormatException) {
        println("invalid port number: ${args[0]}")
    }
}
