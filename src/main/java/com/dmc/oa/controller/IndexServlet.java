package com.dmc.oa.controller;

import com.dmc.oa.entity.Department;
import com.dmc.oa.entity.Employee;
import com.dmc.oa.entity.Node;
import com.dmc.oa.entity.User;
import com.dmc.oa.service.DepartmentService;
import com.dmc.oa.service.EmployeeService;
import com.dmc.oa.service.UserService;

import javax.servlet.*;
import javax.servlet.http.*;
import javax.servlet.annotation.*;
import java.io.IOException;
import java.util.List;

@WebServlet(name = "IndexServlet", value = "/index")
public class IndexServlet extends HttpServlet {
    private UserService userService = new UserService();
    private EmployeeService employeeService= new EmployeeService();
    private DepartmentService departmentService = new DepartmentService();
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        HttpSession session = request.getSession();
        try{
            User user = (User) session.getAttribute("login_user");
            Employee employee = employeeService.selectById(user.getEmployeeId());
            List<Node> nodeList = userService.selectNodeByUserId(user.getUsrId());
            Department department = departmentService.selectById(employee.getDepartmentId());
            request.setAttribute("node_list",nodeList);
            session.setAttribute("current_employee" ,employee);
            session.setAttribute("current_department", department);
            request.getRequestDispatcher("/index.ftl").forward(request,response);
        }catch (NullPointerException e){
            response.sendRedirect("/login.html");
        }

    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
