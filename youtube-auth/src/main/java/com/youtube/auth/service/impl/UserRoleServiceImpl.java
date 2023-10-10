package com.youtube.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youtube.auth.mapper.UserRoleMapper;
import com.youtube.auth.pojo.UserRole;
import com.youtube.auth.service.UserRoleService;
import org.springframework.stereotype.Service;

@Service
public class UserRoleServiceImpl extends ServiceImpl<UserRoleMapper, UserRole> implements UserRoleService {
}