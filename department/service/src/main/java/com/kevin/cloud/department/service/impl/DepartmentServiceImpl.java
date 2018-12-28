package com.kevin.cloud.department.service.impl;

import com.github.pagehelper.PageHelper;
import com.github.pagehelper.PageInfo;
import com.kevin.cloud.department.api.model.Department;
import com.kevin.cloud.department.repository.DepartmentRepository;
import com.kevin.cloud.department.service.DepartmentService;
import com.kevin.common.core.exception.CloudBusinessException;
import com.kevin.common.core.service.BaseService;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Kevin.xu
 * @date 2018/8/6/0:11
 * @description :部门服务实现
 */
@Service
public class DepartmentServiceImpl extends BaseService implements DepartmentService {


  @Autowired
  private DepartmentRepository departmentRepository;


  @Override
  public void addDepartment(Department department) throws CloudBusinessException {

  }

  /**
   * 如今测试是这么开始的么？
   * @param departments
   * @throws CloudBusinessException
   */
  @Override
  public void addDepartments(List<Department> departments) throws CloudBusinessException {

  }

  @Override
  public void updateDepartmentById(Department department) throws CloudBusinessException {

  }

  @Override
  public void deleteDepartmentById(String departmentId) throws CloudBusinessException {

  }

  @Override
  public PageInfo getDepartmentByPage(PageInfo pageInfo) throws CloudBusinessException {
    PageHelper.startPage(0, 1);
    List<Department> departments = departmentRepository.selectByPageNumSize();

    return new PageInfo(departments);
  }
}
