package com.kevin.cloud.department.repository;

import com.github.pagehelper.PageInfo;
import com.kevin.cloud.department.api.model.Department;
import java.util.List;
import java.util.Map;
import org.apache.ibatis.annotations.Param;
import org.springframework.stereotype.Repository;

/**
 * @author Kevin.xu
 * @date 2018/8/5/23:54
 * @description :部门持久化层  DepartmentRepository
 */
@Repository
public interface DepartmentRepository {

  Department getDepartmentByDepartment(Map<String, Object> map);

  List<Department> selectByPageNumSize();

}
