package com.dmc.oa.service;

import com.dmc.oa.entity.Node;
import com.dmc.oa.entity.User;
import org.junit.Test;

import java.util.List;

import static org.junit.Assert.*;

public class UserServiceTest {
    private UserService userService = new UserService();

    @Test
    public void checkLogin1() {
        userService.checkLogin("uu","pass");
    }
    @Test
    public void checkLogin2() {
        userService.checkLogin("m8","pass1");
    }
    @Test
    public void checkLogin3() {
        User user = userService.checkLogin("m8","pass");
        System.out.println(user);
    }
    @Test
    public void selectNodeByUserId(){
        List<Node> nodeList = userService.selectNodeByUserId(2l);
        System.out.println(nodeList);
    }
}