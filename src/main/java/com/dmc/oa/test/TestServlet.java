package com.dmc.oa.test;

import com.dmc.oa.utils.MybatisUtils;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;

@WebServlet(name = "TestServlet", value = "/test")
public class TestServlet extends HttpServlet {
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String result = (String) MybatisUtils.executeQuery(sqlSession -> sqlSession.selectOne("test.sample"));
        request.setAttribute("result" , result);
        request.getRequestDispatcher("/test.ftl").forward(request,response);
    }
}
