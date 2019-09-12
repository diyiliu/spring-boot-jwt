package com.diyiliu.jwt.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * Description: HelloController
 * Author: DIYILIU
 * Update: 2019-09-11 16:03
 */

@RestController
public class HelloController {

    @RequestMapping({"/hello"})
    public String firstPage() {

        return "Hello World";
    }
}
