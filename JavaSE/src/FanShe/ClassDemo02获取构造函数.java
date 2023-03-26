package FanShe;

/*
Class类中用于获取构造器的方法：
*方法	说明
Constructor<?>[] getConstructors()	返回所有构造器对象的数组（只能拿public的）
Constructor<?>[] getDeclaredConstructors()	返回所有构造器对象的数组，存在就能拿到
Constructor<T> getConstructor(Class<?>... parameterTypes)	返回单个构造器对象（只能拿public的）
Constructor<T> getDeclaredConstructor(Class<?>... parameterTypes)	返回单个构造器对象，存在就能拿到
*
*
Constructor类中用于创建对象的方法：
T newInstance(Object... initargs)	根据指定的构造器创建对象
public void  setAccessible(boolean flag)	设置为true,表示取消访问检查，进行暴力反射
*
* */

import org.junit.Test;

import java.lang.reflect.Constructor;
import java.lang.reflect.InvocationTargetException;

public class ClassDemo02获取构造函数 {
    @Test
    public void test01() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        //
        Class<?> aClass = Class.forName("FanShe.Student");
        Constructor<?> constructor = aClass.getConstructor(String.class);
        Student o = (Student) constructor.newInstance("zhangsan");
        System.out.println(o);

        o.show();
    }

    @Test
    public void test02() throws ClassNotFoundException, NoSuchMethodException, InvocationTargetException, InstantiationException, IllegalAccessException {
        // 获取私有构造函数
        Class<?> aClass = Class.forName("FanShe.Student");
        Constructor<?> constructor = aClass.getDeclaredConstructor();
        // 暴力反射，取消检测
        constructor.setAccessible(true);

        Student o = (Student) constructor.newInstance();

        o.show();
    }

    @Test
    public void test03() throws ClassNotFoundException, InstantiationException, IllegalAccessException {
        // 要求类中必须有公共无参构造函数
        Student o = (Student) Class.forName("FanShe.Student").newInstance();
        o.show();
    }

    @Test
    public void test04() throws InvocationTargetException, InstantiationException, IllegalAccessException, NoSuchMethodException, ClassNotFoundException {
        // 满参构造函数
        Class<?> aClass = Class.forName("FanShe.Student");
        Constructor<?> constructor = aClass.getConstructor(String.class, int.class);
        Student haha = (Student) constructor.newInstance("haha", 18);

        haha.show();
    }

}

class Student {
    private String name;
    private int age;

//    private Student() {
//    }

    public Student() {
    }

    public Student(String name) {
        this.name = name;
    }

    public Student(String name, int age) {
        this.name = name;
        this.age = age;
    }

    public void show() {
        System.out.println("student类中的show方法");
    }

    @Override
    public String toString() {
        return "Student{" +
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
