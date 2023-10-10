package com.youtube.auth.mapper;

import com.baomidou.mybatisplus.core.mapper.BaseMapper;
import com.youtube.auth.pojo.UserPermission;
import org.apache.ibatis.annotations.Mapper;

@Mapper
public interface UserPermissionMapper extends BaseMapper<UserPermission> {
}