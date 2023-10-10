package com.youtube.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youtube.auth.mapper.UserPermissionMapper;
import com.youtube.auth.pojo.UserPermission;
import com.youtube.auth.service.UserPermissionService;
import org.springframework.stereotype.Service;

@Service
public class UserPermissionServiceImpl extends ServiceImpl<UserPermissionMapper, UserPermission> implements UserPermissionService {
}