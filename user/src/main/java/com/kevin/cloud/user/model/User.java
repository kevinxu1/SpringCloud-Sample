package com.kevin.cloud.user.model;

import com.kevin.common.core.model.BaseModel;
import lombok.*;

/**
 * 用户实体 Created by Kevin.xu
 */
@Getter
@Setter
@ToString
@Data
@NoArgsConstructor
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
