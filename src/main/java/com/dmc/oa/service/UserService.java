package com.dmc.oa.service;

import com.dmc.oa.dao.RbacDao;
import com.dmc.oa.dao.UserDao;
import com.dmc.oa.entity.Node;
import com.dmc.oa.entity.User;
import com.dmc.oa.service.exception.BussinessException;
import com.dmc.oa.utils.MD5Utils;

import java.util.List;

public class UserService {
    private UserDao userDao = new UserDao();
    private RbacDao rbacDao = new RbacDao();
    public User checkLogin(String username , String password){
        User user = userDao.selectByUsername(username);
        if(user == null){
            //抛出异常
            throw new BussinessException("L001","用户名不不存在");
        }
        String md5 = MD5Utils.md5Digest(password,user.getSalt());
        if (!md5.equals(user.getPassword())){
            throw new BussinessException("L002","密码错误");
        }
        return user;
    }
    public List<Node> selectNodeByUserId(Long userId){
        List<Node> nodeList = rbacDao.selectNodeByUserId(userId);
        return nodeList;
    }
}
