package FanShe;

import org.junit.Test;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;

public class MethodDemo获取对象中方法 {
    @Test
    public void test01() throws NoSuchMethodException, ClassNotFoundException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // 无参方法调用
        Class<?> aClass = Class.forName("FanShe.Student1");
        Method method = aClass.getDeclaredMethod("show");
        method.invoke(aClass.newInstance());
    }
    @Test
    public void test02() throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        // 有参方法调用
        Class<?> aClass = Class.forName("FanShe.Student1");
        Method method = aClass.getDeclaredMethod("method", int.class, String.class);
        method.setAccessible(true);
        // method是静态方法，所以第一个参数可以为null
        Object res = method.invoke(null, 1, "hahaha");
        System.out.println(res == "hahaha");
    }
}


class Student1 {
    private String name;
    private int age;

//    private Student1() {
//    }

    public Student1() {
    }

    public Student1(String name) {
        this.name = name;
    }

    public Student1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("Student1类中的show方法");
    }

    private static String method(int x, String s) {
        System.out.println(x);
        return s;
    }

    @Override
    public String toString() {
        return "Student1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
