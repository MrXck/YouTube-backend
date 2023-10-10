package com.youtube.auth.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("rbac_role")
public class Role {

    private Long id;
    private String name;
    private String roleKey;
}
