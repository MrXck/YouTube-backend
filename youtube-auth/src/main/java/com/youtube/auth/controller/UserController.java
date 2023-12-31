package com.youtube.auth.controller;

import com.youtube.auth.dto.UserRegisterDTO;
import com.youtube.auth.service.UserService;
import io.swagger.annotations.Api;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RestController;

import javax.validation.Valid;

@RestController
@Api(value = "用户相关接口", tags = "用户相关接口")
public class UserController {

    @Autowired
    private UserService userService;

    @PostMapping("/user/register")
    public String register(@RequestBody @Valid UserRegisterDTO userRegisterDTO) {
        userService.register(userRegisterDTO);
        return "注册成功";
    }

}
