package com.youtube.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youtube.auth.pojo.Permission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface PermissionMapper extends BaseMapper<Permission> {
}