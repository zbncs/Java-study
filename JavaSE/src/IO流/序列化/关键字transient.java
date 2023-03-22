package IO流.序列化;

import java.io.Serializable;

/**
 * static：
 * 静态的是不能被序列化的
 *
 * transient：
 * 被它修饰的成员也不能被序列化
 *
 *
 * 用对象序列化流序列化了一个对象后，假如我们修改了对象所属的Javabean类，读取数据会不会出问题呢？
 *      会出问题，会抛出InvalidClassException异常
 *
 *
 * 如果出问题了，如何解决呢？
 *      给对象所属的类加一个serialVersionUID
 *       private static final long serialVersionUID = 42L;
 *
 * 如果一个对象中的某个成员变量的值不想被序列化，又该如何实现呢？
 *      给该成员变量加transient关键字修饰，该关键字标记的成员变量不参与序列化过程
 *
 * */
public class 关键字transient {

}

class Person1 implements Serializable {
    private static final long serialVersionUID = 42L;
    private String name;
    private  int age;

    public Person1() {
    }

    public Person1(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}

