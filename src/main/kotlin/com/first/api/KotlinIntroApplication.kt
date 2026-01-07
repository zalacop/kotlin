package com.first.api

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication class KotlinIntroApplication

fun main(args: Array<String>) {
    println("hello world")
    runApplication<KotlinIntroApplication>(*args)
}
