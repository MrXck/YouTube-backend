package com.youtube.auth.service;

import com.baomidou.mybatisplus.extension.service.IService;
import com.youtube.auth.dto.UserRegisterDTO;
import com.youtube.auth.pojo.User;

public interface UserService extends IService<User> {

    void register(UserRegisterDTO userRegisterDTO);

}