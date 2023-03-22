package Properties集合;

import java.util.ResourceBundle;

/**
 * API介绍
 * java.util.ResourceBundle它是一个抽象类
 * 我们可以使用它的子类PropertyResourceBundle来读取以.properties结尾的配置文件
 * 通过静态方法直接获取对象
 * static ResourceBundle getBundle(String baseName) 可以根据名字直接获取默认语言环境下的属性资源。
 * 参数注意: baseName
 *   	1.属性集名称不含扩展名。
 *     	2.属性集文件是在src目录中的
 * 比如：src中存在一个文件 user.properties
 * ResourceBundle bundle = ResourceBundle.getBundle("user");
 * ResourceBundle中常用方法：
 *  String getString(String key) : 通过键，获取对应的值
 *
 * */

public class ResourceBundle类 {
    public static void main(String[] args) {
        ResourceBundle rb = ResourceBundle.getBundle("test");
        System.out.println(rb.getString("3"));
    }
}
