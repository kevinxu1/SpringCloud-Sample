package com.kevin.cloud.department.api.model;

import com.kevin.common.core.model.BaseModel;
import lombok.Getter;
import lombok.NoArgsConstructor;
import lombok.Setter;

/**
 * @author Kevin.xu
 * @date 2018/8/6/0:43
 * @description :
 */
@Getter
@Setter
@NoArgsConstructor
public class DepartmentUser extends BaseModel {
  private String departmentId;
  private String userId;


}
