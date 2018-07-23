package com.example.cloudservice

import org.springframework.boot.SpringApplication
import org.springframework.boot.autoconfigure.SpringBootApplication
import org.springframework.boot.web.support.SpringBootServletInitializer

@SpringBootApplication
class CloudServiceApplication extends SpringBootServletInitializer {

    static main(def args) {
        def sout = new StringBuilder(), serr = new StringBuilder()
        def proc = 'pwd'.execute()
        proc.consumeProcessOutput(sout, serr)
        proc.waitForOrKill(1000)
        println "out> $sout\nerr> $serr"

        SpringApplication.run CloudServiceApplication, args
    }

}
