package com.neac.kerma

interface Platform {
    val name: String
}

expect fun getPlatform(): Platform