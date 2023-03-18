package JavaApi;

import java.util.Objects;

/**
 *      如果一个类没有重写equals方法，那么比较这个类的对象比较的是地址值
 *
 *     若重写了equals方法，那么比较的这类的属性值是否相等
 *
 * */

public class ObjectClass {
    public static void main(String[] args) {
        Stu s1 = new Stu("zs", 18);
        Stu s2 = new Stu("zs", 18);

        System.out.println(s1.equals(s2));
    }
}

class Stu {
    private String name;
    private int age;

    public Stu() {
    }

    public Stu(String name, int age) {
        this.name = name;
        this.age = age;
    }
    // getClass() : 获取类的字节码
    // 自动生成的: cmd + N
    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Stu stu = (Stu) o;
        return age == stu.age && Objects.equals(name, stu.name);
    }

    @Override
    public String toString() {
        return "Stu{" +
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
