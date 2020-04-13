package com.example.mall.controller;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description
 *
 * @author : Charles
 * @date : 2020/4/13
 */
@RestController
public class TestController {
    @GetMapping("/")
    public String testApi(){
        return "welcome!";
    }
}
