package com.example.demomaventomcatestudy.LifeOfServlet;

import jakarta.servlet.*;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;

@WebServlet(name = "lifeOfServlet", value = "/life")
public class LifeServlet implements Servlet {
    // 用户第一次访问时，创建servlet
    public LifeServlet() {
        System.out.println("无参构造函数");
    }
    // 1. servlet对象创建完毕，使用对象调用此方法，初始化方法，只有在第一次访问的时候执行一次
    @Override
    public void init(ServletConfig servletConfig) throws ServletException {
        System.out.println("init初始化");
    }

    @Override
    public ServletConfig getServletConfig() {
        return null;
    }
    // 2. 用户访问servlet时，调用此方法 (每次访问都会调用一次)
    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("service 方法");
    }

    @Override
    public String getServletInfo() {
        return null;
    }
    // 3. servlet对象销毁时，调用此方法
    @Override
    public void destroy() {
        System.out.println("destroy方法");
    }
}
