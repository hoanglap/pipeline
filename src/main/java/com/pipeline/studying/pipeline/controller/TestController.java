package com.pipeline.studying.pipeline.controller;

import org.springframework.web.bind.annotation.RestController;

@RestController
public class TestController {
    public String hello() {
        return "Hello Pipeline";
    }

    public String goodBye() {
        return "GoodBye Pipeline";
    }

    public String goodBye2() {
        return "GoodBye2 Pipeline";
    }
}
