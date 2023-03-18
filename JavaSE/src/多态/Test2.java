package 多态;

/**
 *      多态优缺点
 *          优点：提高代码的扩展性；
 *          缺点：多态不能访问子类的特有功能；
 *
 *      转型
 *          向上转型：把子类的对象赋值给父类变量
 *          向下转型：把父类类型的数据赋值给子类类型变量
 *
 *          Animal a = new Dog(); // 向上转型
 *          Dog dog = (Dog) a;
 *
 *          向下转换的类型和目标类型不一致会发生ClassCastException（类型转换异常）
 *          需要使用instanceof 判断
 * */

public class Test2 {
}


