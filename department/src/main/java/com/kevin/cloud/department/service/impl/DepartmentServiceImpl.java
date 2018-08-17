package com.kevin.cloud.department.service.impl;

import com.kevin.cloud.department.model.Department;
import com.kevin.cloud.department.repository.DepartmentRepository;
import com.kevin.cloud.department.service.DepartmentService;
import com.kevin.cloud.department.service.client.UserFeginClient;
import com.kevin.cloud.user.model.User;
import com.kevin.common.core.exception.CloudBusinessException;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

/**
 * @author Kevin.xu
 * @date 2018/8/6/0:11
 * @description :部门服务实现
 */
@Service
public class DepartmentServiceImpl implements DepartmentService {

  @Autowired
  private DepartmentRepository departmentRepository;
  @Autowired
  private UserFeginClient userFeginClient;

  @Override
  public void addDepartment(Department department) throws CloudBusinessException {

  }

  @Override
  public void addDepartmentUsers(List<User> users) throws CloudBusinessException {

  }

  @Override
  public void updateDepartment(Department department) throws CloudBusinessException {

  }

  @Override
  public Department getDepartmentByDepartment(Department department) throws CloudBusinessException {
    Map<String, Object> map = new HashMap<>();
    map.put("id", department.getId());
    Department dt = departmentRepository.getDepartmentByDepartment(map);
    List<User> users = new ArrayList<>();
    users.add(userFeginClient.getUser("张三1"));
    dt.setUsers(users);
    return dt;
  }

  @Override
  public List<Department> getDeoartmentsByDepartment(Department department)
      throws CloudBusinessException {
    return null;
  }
}
