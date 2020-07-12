package com.yjzn.starter.controller;

import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;



@RestController
@RequestMapping("/user")
public class UserController {

    @RequestMapping(value = "/test")
    public String  findOrderAllocation() {
        return "hello user test ";
    }

}
