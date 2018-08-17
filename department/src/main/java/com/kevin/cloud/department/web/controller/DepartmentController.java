package com.kevin.cloud.department.web.controller;

import com.kevin.cloud.department.model.Department;
import com.kevin.cloud.department.service.DepartmentService;
import com.kevin.common.core.exception.CloudBusinessException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;

/**
 * @author Kevin.xu
 * @date 2018/8/6/1:01
 * @description :
 */
@RestController
@RequestMapping(value = DepartmentController.DEPARTMENT_PATH)
public class DepartmentController {

  final static String DEPARTMENT_PATH = "/department";
  @Autowired
  private DepartmentService departmentService;

  @GetMapping()
  public Department getDepartmentById() {
    Department department = new Department();
    department.setId("1");
    try {
      department = departmentService.getDepartmentByDepartment(department);
    } catch (CloudBusinessException e) {
      e.printStackTrace();
    }
    return department;
  }
}
