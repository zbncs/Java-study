package 泛型数据结构集合.双列集合;

import java.util.HashMap;
import java.util.Objects;
import java.util.Set;

public class HashMap自定义键 {
    /**
     * HashMap使用自定义类型当做键使用时 需要注意： 自定义类需要重写hashCode和equals方法
     * 存放数据时会执行hashCode和equals方法来去重
     * */
    public static void main(String[] args) {
        HashMap<Studennt, String> mp = new HashMap<>();
        mp.put(new Studennt("zs", 18), "18");
        mp.put(new Studennt("zs1", 19), "19");
        mp.put(new Studennt("zs", 18), "18");

        Set<Studennt> s = mp.keySet();

        for (Studennt key : s) {
            String val = mp.get(key);
            System.out.println(val + "" + key);
        }
    }
}

class Studennt {
    private String name;
    private int age;

    public Studennt() {
    }

    public Studennt(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Studennt studennt = (Studennt) o;
        return age == studennt.age && Objects.equals(name, studennt.name);
    }

    @Override
    public int hashCode() {
        return Objects.hash(name, age);
    }

    @Override
    public String toString() {
        return "Studennt{" +
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

