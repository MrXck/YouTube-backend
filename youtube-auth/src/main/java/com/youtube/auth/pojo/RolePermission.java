package com.youtube.auth.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("rbac_role_permissions")
public class RolePermission {

    private Long id;
    private Long roleId;
    private Long permissionId;
}
