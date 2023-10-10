package com.youtube.auth.pojo;

import com.baomidou.mybatisplus.annotation.TableName;
import lombok.Data;

@Data
@TableName("rbac_permission")
public class Permission {

    private Long id;
    private String url;
    private String title;
    private String urlName;
    private String menuName;
    private Long parentId;
}