package com.kevin.cloud.department.service;

import com.kevin.cloud.department.api.model.Department;

import com.kevin.cloud.user.api.model.User;
import com.kevin.common.core.exception.CloudBusinessException;
import java.util.List;

/**
 * @author Kevin.xu
 * @date 2018/8/5/23:56
 * @description :部门服务层接口
 */
public interface DepartmentService {

  /**
   * 添加部门信息
   *
   * @param department 对象
   */
  void addDepartment(Department department) throws CloudBusinessException;

  /**
   * 添加部门用户
   * @param users 用户集合
   * @throws CloudBusinessException
   */
  void addDepartmentUsers(List<User> users) throws CloudBusinessException;


  /**
   * 修改部门信息
   *
   * @param department 对象
   */
  void updateDepartment(Department department) throws CloudBusinessException;

  /**
   * 查询部门信息
   *
   * @param department 对象
   */
  Department getDepartmentByDepartment(Department department) throws CloudBusinessException;

  /**
   * 查询部门信息 多个
   *
   * @param department 对象
   */
  List<Department> getDeoartmentsByDepartment(Department department) throws CloudBusinessException;





}
