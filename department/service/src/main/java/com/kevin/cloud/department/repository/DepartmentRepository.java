package com.kevin.cloud.department.repository;

import com.kevin.cloud.department.api.model.Department;
import java.util.Map;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin.xu
 * @date 2018/8/5/23:54
 * @description :部门持久化层  DepartmentRepository
 */
@Repository
public interface DepartmentRepository {
   Department getDepartmentByDepartment(Map<String,Object> map);

}
