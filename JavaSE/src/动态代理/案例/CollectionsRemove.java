package 动态代理.案例;

import java.lang.reflect.InvocationHandler;
import java.lang.reflect.Method;
import java.lang.reflect.Proxy;
import java.util.ArrayList;
import java.util.Collection;
import java.util.Collections;

/*
对Collection接口的子类ArrayList进行代理，以前的remove(Object obj)方法是删除集合中第一次出现的元素(比如集合中有多个“abc”,调用remove(“abc”)后只会删除一个元素)。
代理后，要求在调用remove(Object obj)方法后，能够删除集合中所有匹配的元素。【动态代理】
* */

public class CollectionsRemove {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        ClassLoader loader = list.getClass().getClassLoader();
        Class<?>[] interfaces = list.getClass().getInterfaces();

        InvocationHandler h = new InvocationHandler() {
            @Override
            public Object invoke(Object proxy, Method method, Object[] args) throws Throwable {
                String name = method.getName();
                if (name == "remove") {
                    String elem = (String) args[0];
                    System.out.println(elem);
                    return list.removeAll(Collections.singleton(elem));
                }
                // 其他方法不增强
                System.out.println(method);
                Object o = method.invoke(list, args);
                return o;
            }
        };

        Collection<String> proxyInstance = (Collection) Proxy.newProxyInstance(loader, interfaces, h);


        Collections.addAll(list, "abc", "aaa", "abc", "ccc", "ddd", "abc");
        proxyInstance.remove("abc");
        proxyInstance.add("gkn");
        System.out.println(list);
    }
}
