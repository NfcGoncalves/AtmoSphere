package com.example.atmosphere

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform