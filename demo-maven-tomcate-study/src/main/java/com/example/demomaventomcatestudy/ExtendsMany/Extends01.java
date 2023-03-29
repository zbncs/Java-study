package com.example.demomaventomcatestudy.ExtendsMany;

import jakarta.servlet.GenericServlet;
import jakarta.servlet.ServletException;
import jakarta.servlet.ServletRequest;
import jakarta.servlet.ServletResponse;
import jakarta.servlet.annotation.WebServlet;

import java.io.IOException;
// 方式二的好处是只需要重写service方法，在方法体内部处理业务逻辑即可。
@WebServlet(name = "extends01", value = "/extends01")
public class Extends01 extends GenericServlet {

    @Override
    public void service(ServletRequest servletRequest, ServletResponse servletResponse) throws ServletException, IOException {
        System.out.println("extends GenericServlet");
    }
}
