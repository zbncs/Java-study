package com.imooc.spring.ioc.entity;

public class Apple {
    private String title;
    private String color;
    private String origin;

    public Apple() {
        // bean中没有property时，默认调用无参构造方法创建对象
    }

    public Apple(String title, String color, String origin) {
        System.out.println("通过带参构造方法创建对象");
        this.title = title;
        this.color = color;
        this.origin = origin;
    }

    public String getTitle() {
        return title;
    }

    public void setTitle(String title) {
        this.title = title;
    }

    public String getColor() {
        return color;
    }

    public void setColor(String color) {
        this.color = color;
    }

    public String getOrigin() {
        return origin;
    }

    public void setOrigin(String origin) {
        this.origin = origin;
    }
}
