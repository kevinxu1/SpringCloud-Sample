package com.kevin.cloud.user.api.model;

import com.kevin.common.core.model.BaseModel;
import lombok.*;

/**
 * 用户实体 Created by Kevin.xu
 */

@NoArgsConstructor
@Setter
@Getter
@ToString
public class User extends BaseModel {

  //用户名
  private String username;
  //用户性别
  private String sex;
  //电话
  private String phone;
  //登录密码
  private String password;


}
