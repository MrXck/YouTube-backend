package com.youtube.auth.pojo;

import lombok.Data;

import java.util.ArrayList;
import java.util.List;

@Data
public class UserPermission extends User {

    //用户权限
    List<String> permissions = new ArrayList<>();
}
