package com.dmc.oa.dao;

import com.dmc.oa.entity.Department;

public interface DepartmentDao {
    public Department selectById(Long departmentId);
}
