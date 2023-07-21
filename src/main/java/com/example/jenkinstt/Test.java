package com.example.jenkinstt;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @Author: lst
 * @Date: 2023/7/21
 * @Description: TODO
 **/
@RestController("/jen")
public class Test {

    @GetMapping("/get")
    public String get() {
        return "Hello Jenkins";
    }
}
