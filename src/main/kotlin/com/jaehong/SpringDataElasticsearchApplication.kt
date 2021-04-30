package com.jaehong

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class SpringDataElasticsearchApplication

fun main(args: Array<String>) {
  runApplication<SpringDataElasticsearchApplication>(*args)
}
