package FanShe;

/*
*获取Class类的对象的三种方式:

方式一：Class c1 = Class.forName(“全类名”);
方式二：Class c2 = 类名.class
方式三：Class c3 = 对象.getClass();

* */

public class ClassDemo01 {
    public static void main(String[] args) throws ClassNotFoundException {
        // 1.类名.class
        Class<ClassDemo01> aClass = ClassDemo01.class;
        System.out.println(aClass);
        // 一些方法
        String name = aClass.getName();
        String simpleName = aClass.getSimpleName();
        System.out.println(name);
        System.out.println(simpleName);
        // 2.使用Class类中的forName()
        Class<?> aClass1 = Class.forName("FanShe.ClassDemo01");
        System.out.println(aClass1);

        // 3.使用实例的getClass方法
        Class<? extends ClassDemo01> aClass2 = new ClassDemo01().getClass();
        System.out.println(aClass2);
    }
}
