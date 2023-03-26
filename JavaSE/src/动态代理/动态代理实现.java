package 动态代理;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;

/**
 * 在java中实现动态代理，关键要使用到一个 Proxy 类和一个 InvocationHandler 接口
 *
 *Proxy 类 提供了用于创建动态代理类和实 例的静态方法：
 * Object newProxyInstance(ClassLoader loader, Class<?>[] interfaces, InvocationHandler handle)
 *      ClassLoader loader: 定义代理类的类加载器
 *      Class<?>[] interfaces:  代理类要实现的接口列表，要求与被代理类的接口一样
 *      InvocationHandler handle:   就是具体实现代理逻辑的接口
 *
 * InvocationHandler 接口: 代理对象的实际处理代理逻辑的接口，具体代理逻辑在其 invoke 方法中实现
 *
 * public Object invoke(Object proxy, Method method, Object[] args)
 *      Object proxy :  就是代理对象(通常不使用)
 *       Method method :代理对象调用的方法
 *      Object[] args :被代理方法中的参数 (因为参数个数不定，所以用一个对象数组来表示)
 *          如果方法不使用参数，则为 null
 *
 *
 *
 * */

public class 动态代理实现 {
    public static void main(String[] args) {

        // loader:定义代理类的类加载器
        ClassLoader loader = UserService.class.getClassLoader();
        // Class<?>[] interfaces:  代理类要实现的接口列表，要求与被代理类的接口一样
        Class<?>[] interfaces = {UserService.class};
        // h：就是具体实现代理逻辑的接口

        InvocationHandler h = new InvocationHandler() {

            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String methodName = method.getName();
                long start = System.currentTimeMillis();
                if (methodName == "login") {
                    System.out.println("登录");
                    Thread.sleep(3000);
                } else if (methodName == "delete") {
                    System.out.println("删除");
                    Thread.sleep(4000);
                } else {
                    System.out.println("查询");
                    Thread.sleep(5000);
                }
                long end = System.currentTimeMillis();
                System.out.println(methodName+"耗时:"+(end-start));
                return null;
            }
        };

        // 代理对象（实现类对象）
        UserService userService = (UserService) Proxy.newProxyInstance(loader, interfaces, h);

        //
        userService.login();
        userService.delete();
        userService.query();
    }
}

interface UserService {
    void login();
    void delete();
    void query();
}
