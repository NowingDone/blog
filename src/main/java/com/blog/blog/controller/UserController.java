package com.blog.blog.controller;

import io.swagger.annotations.ApiOperation;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

@RestController
public class UserController {

    @ApiOperation(value="获取用户信息",notes = "根据用户id获取用户信息")
    @RequestMapping("/user")
    public String getInfo(){

        return "nihao1";

    }
}
