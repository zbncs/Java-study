package 泛型数据结构集合.Set接口;

import java.util.HashSet;
import java.util.Objects;

/**
 * HashSet集合要想保证唯一性，南无集合中的存储的元素所在的类就必须重写hashCode 和 equals方法
 *
 *
 * */

public class HashSetDemo {
    public static void main(String[] args) {
        HashSet<Student2> hs = new HashSet<>();

        Student2 s1 = new Student2("zs", 18);
        Student2 s2 = new Student2("zs", 18);
        Student2 s3 = new Student2("zs1", 18);

        hs.add(s1);
        hs.add(s2);
        hs.add(s3);

        for (Student2 s : hs) {
            // 重写toString() 方法方可打印
            System.out.println(s);
        }
    }
}

class Student2 {
    private String name;
    private int age;

    public Student2() {
    }

    public Student2(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Student2 student2 = (Student2) o;
        return age == student2.age && Objects.equals(name, student2.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Student2{" +
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
