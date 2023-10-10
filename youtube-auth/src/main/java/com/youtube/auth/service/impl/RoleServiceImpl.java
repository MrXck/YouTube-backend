package com.youtube.auth.service.impl;

import com.baomidou.mybatisplus.extension.service.impl.ServiceImpl;
import com.youtube.auth.mapper.RoleMapper;
import com.youtube.auth.pojo.Role;
import com.youtube.auth.service.RoleService;
import org.springframework.stereotype.Service;

@Service
public class RoleServiceImpl extends ServiceImpl<RoleMapper, Role> implements RoleService {
}