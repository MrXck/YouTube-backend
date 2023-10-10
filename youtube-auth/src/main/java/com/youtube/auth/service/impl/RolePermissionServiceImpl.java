package com.youtube.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youtube.auth.mapper.RolePermissionMapper;
import com.youtube.auth.pojo.RolePermission;
import com.youtube.auth.service.RolePermissionService;
import org.springframework.stereotype.Service;

@Service
public class RolePermissionServiceImpl extends ServiceImpl<RolePermissionMapper, RolePermission> implements RolePermissionService {
}