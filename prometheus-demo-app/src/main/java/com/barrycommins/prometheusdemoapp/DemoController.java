package com.barrycommins.prometheusdemoapp;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
@RequestMapping("/")
class DemoController {

    @GetMapping
    Hello sayHello() {
        return new Hello("Hello, World");
    }
}