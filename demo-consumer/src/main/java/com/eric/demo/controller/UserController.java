package com.eric.demo.controller;

import com.alibaba.dubbo.config.annotation.Reference;
import com.eric.demo.service.IUserService;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @Reference(version = "1.0")
    private IUserService userService;

    @RequestMapping("/user/{userid}")
    public String getUser(@PathVariable Integer userid) {
        return userService.getUser(userid);
    }
}
