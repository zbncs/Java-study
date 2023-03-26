package FanShe;

import java.lang.reflect.InvocationTargetException;
import java.lang.reflect.Method;
import java.util.ResourceBundle;

public class 反射案例 {
    public static void main(String[] args) throws ClassNotFoundException, NoSuchMethodException, InstantiationException, IllegalAccessException, InvocationTargetException {
        ResourceBundle animal = ResourceBundle.getBundle("animal");
        String className = animal.getString("className");
        String methodName = animal.getString("method");
        System.out.println(className);
        Class<?> aClass = Class.forName(className);
        Method classMethod = aClass.getMethod(methodName);
        classMethod.invoke(aClass.newInstance());
    }
}

class Dog {
    public void eat(){
        System.out.println("狗爱吃肉");
    }
    public void sleep(){
        System.out.println("狗睡觉流口水");
    }
}

class Cat {
    public void eat(){
        System.out.println("猫爱吃鱼");
    }
    public void sleep(){
        System.out.println("猫睡觉打呼噜");
    }
}
