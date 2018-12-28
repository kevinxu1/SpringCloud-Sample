package com.kevin.cloud.department.service;

import com.github.pagehelper.PageInfo;
import com.kevin.cloud.department.api.model.Department;
import com.kevin.common.core.exception.CloudBusinessException;
import java.util.List;

/**
 * @author Kevin.xu
 * @date 2018/8/5/23:56
 * @description :部门服务层接口
 */
public interface DepartmentService {

  /**
   * 添加部门
   * @param department
   * @throws CloudBusinessException
   */
  void addDepartment(Department department) throws CloudBusinessException;

  /**
   * 添加部门集合
   * @param departments
   * @throws CloudBusinessException
   */
  void addDepartments(List<Department> departments) throws CloudBusinessException;

  /**
   * 根据部门Id 修改部门信息
   * @param department
   * @throws CloudBusinessException
   */
  void updateDepartmentById(Department department) throws CloudBusinessException;

  /**
   * 根据部门Id 删除部门
   * @param departmentId
   * @throws CloudBusinessException
   */
  void deleteDepartmentById(String departmentId)throws  CloudBusinessException;

  /**
   * 分页查询部门
   * @param pageInfo
   * @return
   * @throws CloudBusinessException
   */
  PageInfo getDepartmentByPage(PageInfo pageInfo)throws CloudBusinessException;

}
