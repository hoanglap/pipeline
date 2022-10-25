package com.pipeline.studying.pipeline.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public String hello() {
        return "Hello Pipeline";
    }
}
