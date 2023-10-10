package com.youtube.auth.service.impl;

import com.baomidou.mybatisplus.core.conditions.query.LambdaQueryWrapper;
import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youtube.auth.dto.UserRegisterDTO;
import com.youtube.auth.exception.APIException;
import com.youtube.auth.mapper.UserMapper;
import com.youtube.auth.pojo.User;
import com.youtube.auth.service.UserService;
import org.springframework.beans.BeanUtils;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.security.crypto.password.PasswordEncoder;
import org.springframework.stereotype.Service;

import java.time.LocalDateTime;

@Service
public class UserServiceImpl extends ServiceImpl<UserMapper, User> implements UserService {

    @Autowired
    private PasswordEncoder passwordEncoder;

    @Override
    public void register(UserRegisterDTO userRegisterDTO) {
        String username = userRegisterDTO.getUsername();

        LambdaQueryWrapper<User> queryWrapper = new LambdaQueryWrapper<>();
        queryWrapper.eq(User::getUsername, username);

        if (this.count(queryWrapper) > 0) {
            throw new APIException("该用户名已存在");
        }

        User user = new User();
        BeanUtils.copyProperties(userRegisterDTO, user);
        user.setCreateTime(LocalDateTime.now());
        user.setUpdateTime(LocalDateTime.now());
        user.setPassword(passwordEncoder.encode(user.getPassword()));
        this.save(user);
    }
}