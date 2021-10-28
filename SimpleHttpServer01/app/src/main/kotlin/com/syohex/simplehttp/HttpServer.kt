package com.syohex.simplehttp

import java.net.ServerSocket

class HttpServer(private val port: Int) {
    fun start() {
        val socket = ServerSocket(port)
        socket.reuseAddress = true

        socket.use {
            val client = socket.accept()
        }
    }
}