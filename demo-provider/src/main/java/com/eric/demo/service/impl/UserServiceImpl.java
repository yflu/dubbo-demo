package com.eric.demo.service.impl;

import com.alibaba.dubbo.config.annotation.Service;
import com.eric.demo.service.IUserService;

@Service(version = "1.0")
public class UserServiceImpl implements IUserService {

    @Override
    public String getUser(Integer userid) {
        System.out.println(userid + ",来了...");
        return "hello," + userid;
    }
}
