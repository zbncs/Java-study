package com.example.demomaventomcatestudy.ExtendsMany;

import jakarta.servlet.ServletException;
import jakarta.servlet.annotation.WebServlet;
import jakarta.servlet.http.HttpServlet;
import jakarta.servlet.http.HttpServletRequest;
import jakarta.servlet.http.HttpServletResponse;

import java.io.IOException;

@WebServlet(name = "extends02", value = "/extends02")
public class Extends02 extends HttpServlet {
    /*
    在子类中根据不同的请求方式重写请求方式的方法：
        get请求---重写doGet方法
        post请求---重写doPost方法

       control + o: 重写方法
	*/

    @Override
    protected void doGet(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("get");
    }

    @Override
    protected void doPost(HttpServletRequest req, HttpServletResponse resp) throws ServletException, IOException {
        System.out.println("post");
    }
}
