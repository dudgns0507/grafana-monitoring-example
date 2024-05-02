package dev.cropo.springsample.controller

import org.slf4j.LoggerFactory
import org.springframework.http.ResponseEntity
import org.springframework.web.bind.annotation.GetMapping
import org.springframework.web.bind.annotation.RequestMapping
import org.springframework.web.bind.annotation.RestController

@RestController
@RequestMapping("/api/v1/test")
class TestController {
    private val log = LoggerFactory.getLogger(TestController::class.java)

    @GetMapping("/hello")
    fun hello(): ResponseEntity<*> {
        log.debug("Hello World!")
        return ResponseEntity.ok("Hello World!")
    }
}