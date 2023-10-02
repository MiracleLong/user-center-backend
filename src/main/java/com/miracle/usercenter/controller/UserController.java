package com.miracle.usercenter.controller;

import com.miracle.usercenter.service.UserService;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

import javax.annotation.Resource;

/**
 * 用户 接口
 * @author dargon
 * @create 2023-10-02
 */
@RestController
@RequestMapping("/user")
public class UserController {

    @Resource
    private UserService userService;
}
