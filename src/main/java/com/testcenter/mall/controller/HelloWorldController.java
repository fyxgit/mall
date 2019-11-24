package com.testcenter.mall.controller;

import com.testcenter.mall.model.User;
import io.swagger.annotations.Api;
import io.swagger.annotations.ApiOperation;
import io.swagger.annotations.ApiParam;
import org.springframework.web.bind.annotation.*;

/**
 * @Program: mall
 * @Description：controller示例demo
 * @Author: huaxin
 * @Aate: 2019/10/27
 **/

@Api(tags = "SpringBoot demo")
@RestController
@RequestMapping("/demo")
public class HelloWorldController {

    @GetMapping("/hello")
    @ApiOperation(value = "index show time", notes = " 这是第一个api示例")
    public String index() {
        return "Hi springboot";
    }

    @PostMapping("/user")
    @ApiOperation(value = "获取用户信息", notes = "返回用户的具体信息：姓名，年龄，邮箱")
    public String showUser(@ApiParam("User") @RequestBody User user_1) {
        User user = new User();
        user.setAge(12);
        user.setEmail("test@163.com");
        user.setName("test");
        return user.toString();
    }
}
