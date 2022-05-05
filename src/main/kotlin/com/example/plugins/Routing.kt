package com.example.plugins

import io.ktor.application.Application
import io.ktor.application.call
import io.ktor.response.respondText
import io.ktor.routing.get
import io.ktor.routing.routing

fun Application.configureRouting() {

    // Starting point for a Ktor app:
    routing {
        get("/hello") {
            call.respondText("Hello World!")
        }
    }
    routing {
        get("/internal/isalive") {
            call.respondText("alive!")
        }
    }

    routing {
        get("/internal/isready") {
            call.respondText("ready!")
        }
    }
}
