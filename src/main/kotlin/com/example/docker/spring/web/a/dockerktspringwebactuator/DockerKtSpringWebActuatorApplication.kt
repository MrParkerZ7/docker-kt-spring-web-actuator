package com.example.docker.spring.web.a.dockerktspringwebactuator

import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.runApplication

@SpringBootApplication
class DockerKtSpringWebActuatorApplication

fun main(args: Array<String>) {
    runApplication<DockerKtSpringWebActuatorApplication>(*args)
}
