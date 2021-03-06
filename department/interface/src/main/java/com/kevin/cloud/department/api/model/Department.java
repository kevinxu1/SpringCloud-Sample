package com.kevin.cloud.department.api.model;


import com.kevin.cloud.user.api.model.User;
import com.kevin.common.core.model.BaseModel;
import java.util.List;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;
import lombok.ToString;


@NoArgsConstructor
@Setter
@Getter
@ToString
public class Department extends BaseModel {

  private String name;
  private String code;
  private String parentId;
  private List<User> users;

}
