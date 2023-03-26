package 反射;

import org.junit.Test;

import java.lang.reflect.Field;

public class ClassDemo03反射获取成员变量 {
    @Test
    public void test01() throws ClassNotFoundException, NoSuchFieldException, InstantiationException, IllegalAccessException {
        Class<?> aClass = Class.forName("反射.Person");
        Field address = aClass.getDeclaredField("address");
        address.setAccessible(true);

        Person p = (Person) aClass.newInstance();
        address.set(p, "亳州市");
        Object o = address.get(p);
        System.out.println(o == "亳州市");
    }
}

class Person {
    private String address;

}
