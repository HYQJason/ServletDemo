package com.test;

import javax.servlet.ServletException;
import javax.servlet.annotation.WebServlet;
import javax.servlet.http.HttpServlet;
import javax.servlet.http.HttpServletRequest;
import javax.servlet.http.HttpServletResponse;
import java.io.IOException;
import java.io.PrintWriter;
import java.util.Enumeration;

@WebServlet(name = "DemoServlet")
public class DemoServlet extends HttpServlet {
    private String message = "bbbbbbbbbb";

    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }

    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        String type = request.getParameter("type");
        if (type != null) {
            // 设置响应内容类型
            response.setContentType("text/html;charset=UTF-8");
            PrintWriter out = response.getWriter();
            if (type.equals("Login")) {
                out.println("<h1>" + "登录" + "</h1>");
            } else if (type.equals("register")) {
                out.println("<h1>" + "注册" + "</h1>");
            } else {

                out.println("<h1>" + "500" + "</h1>");

            }
        }


    }
}
