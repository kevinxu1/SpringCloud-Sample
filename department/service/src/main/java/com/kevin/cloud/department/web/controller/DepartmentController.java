package com.kevin.cloud.department.web.controller;

import com.github.pagehelper.PageInfo;
import com.kevin.cloud.department.api.model.Department;
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
  public PageInfo getDepartmentById() {
    PageInfo pageInfo=new PageInfo();
    pageInfo.setPageNum(0);
    pageInfo.setPageSize(1);
    try {
      pageInfo = departmentService.getDepartmentByPage(pageInfo);
    } catch (CloudBusinessException e) {
      e.printStackTrace();
    }
    return pageInfo;
  }
}
