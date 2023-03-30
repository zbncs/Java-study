package com.example.demomaventomcatestudy.ReqAndRes;

import jakarta.servlet.*;
import jakarta.servlet.http.*;
import jakarta.servlet.annotation.*;

import java.io.IOException;
import java.util.Arrays;
import java.util.Map;

@WebServlet("/ReqAndResServlet")
public class ReqAndResServlet extends HttpServlet {
    @Override
    protected void doGet(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {
        //
//        String[] name = request.getParameterValues("name");
//        System.out.println(Arrays.toString(name));
        Map<String, String[]> map = request.getParameterMap();
        map.forEach((key, value) -> {
            System.out.println(key + "=" + Arrays.toString(value));
        });
//        response.setHeader("content-type","text/html;charset=utf-8");
//        response.getWriter().write("<h1>"+name+",欢迎您！</h1>");
    }

    @Override
    protected void doPost(HttpServletRequest request, HttpServletResponse response) throws ServletException, IOException {

    }
}
