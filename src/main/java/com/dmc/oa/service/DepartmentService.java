package com.dmc.oa.service;

import com.dmc.oa.dao.DepartmentDao;
import com.dmc.oa.entity.Department;
import com.dmc.oa.utils.MybatisUtils;

public class DepartmentService {
    public Department selectById(Long departmentId){
        return (Department) MybatisUtils.executeQuery(sqlSession -> sqlSession.getMapper(DepartmentDao.class).selectById(departmentId));
    }
}
