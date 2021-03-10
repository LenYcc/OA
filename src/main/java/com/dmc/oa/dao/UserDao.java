package com.dmc.oa.dao;

import com.dmc.oa.entity.User;
import com.dmc.oa.utils.MybatisUtils;

public class UserDao {
    public User selectByUsername(String username){
        return (User)MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("usermapper.selectByUsername" , username));
    }
}
