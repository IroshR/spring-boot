package com.iroshnk.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Created by HP on 12/26/2017.
 */
@RestController
public class HelloController {
    @RequestMapping("/hello")
    public String hello() {
        System.out.println("Hello Spring-Boot");
        return "Hello SPRING BOOT ！！！";
    }
}
