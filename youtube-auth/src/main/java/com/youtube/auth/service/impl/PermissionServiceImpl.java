package com.youtube.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youtube.auth.mapper.PermissionMapper;
import com.youtube.auth.pojo.Permission;
import com.youtube.auth.service.PermissionService;
import org.springframework.stereotype.Service;

@Service
public class PermissionServiceImpl extends ServiceImpl<PermissionMapper, Permission> implements PermissionService {
}