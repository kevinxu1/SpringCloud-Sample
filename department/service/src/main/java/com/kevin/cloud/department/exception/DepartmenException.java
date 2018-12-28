package com.kevin.cloud.department.exception;

import com.kevin.common.core.exception.BusinessException;

public enum DepartmenException implements BusinessException {

  DEPARTMENT_ID_NULL("1001001", "部门ID不存在！"),
  DEPARTMENT_NOT_EXIST("1001002", "部门不存在！"),
  DEPARTMEN_CAN_NOT_DELETE("1001002", "不可删除！"),
  DEPARTMEN_MEASSAGE_NULL("1001003", "部门信息为空!"),
  DEPARTMENT_CODE_NULL("10001004", "部门Code为空！"),
  DEPARTMENT_NAME_NULL("10001005", "部门名称为空！"),
  DEPARTMENT_OPERATOR_NULL("10001006", "操作人为空！"),
  DEPARTMEN_PARENT_ID_NULL("10001007", "父部门Id为空！"),
  DEPARTMEN_SHORT_NAME_NULL("10001008", "部门简称为空！");
  private String code;
  private String message;

  DepartmenException(String code, String message) {
    this.setCode(code);
    this.setMessage(message);
  }

  public void setCode(String code) {
    this.code = code;
  }

  @Override
  public String getCode() {
    return this.code;
  }

  @Override
  public String getMessage() {
    return this.message;
  }

  @Override
  public String setMessage(String message) {
    return this.message;
  }

}
