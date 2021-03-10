package com.dmc.oa.service;

import com.dmc.oa.dao.EmployeeDao;
import com.dmc.oa.entity.Employee;
import com.dmc.oa.utils.MybatisUtils;

public class EmployeeService {
    public Employee selectById(Long employeeId){
        return (Employee) MybatisUtils.executeQuery(sqlSession -> {
            EmployeeDao employeeDao = sqlSession.getMapper(EmployeeDao.class);
            return employeeDao.selectById(employeeId);
        });
    }
}
