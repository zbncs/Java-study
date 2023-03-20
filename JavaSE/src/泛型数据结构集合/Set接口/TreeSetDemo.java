package 泛型数据结构集合.Set接口;

import java.util.Comparator;
import java.util.TreeSet;

/**
 * TreeSet集合特点
 *
 * 不包含重复元素的集合
 * 没有带索引的方法
 * 可以将元素按照 规则 进行排序
 *
 * 排序方式：自然排序 和 比较器排序
 *
 * 自然排序
 *
 * 使用空参构造创建TreeSet集合
 * 自定义的Student类实现Comparable接口
 * 重写里面的compareTo方法
 *
 * 根据compareTo方法的返回值进行指定元素位置
 * 如果返回值为负数，表示当前存入的元素是较小值，存左边
 * 如果返回值为0，表示当前存入的元素跟集合中元素重复了，不存
 * 如果返回值为正数，表示当前存入的元素是较大值，存右边
 *
 *
 * 比较器排序
 *
 * TreeSet的带参构造方法使用的是  “比较器排序” 对元素进行排序的
 * 比较器排序，就是让TreeSet集合构造方法接收Comparator接口的 实现类 对象
 * 重写Comparator接口中的 compare(T o1,T o2)方法 , 指定排序规则
 * 注意 : o1代表的是当前往集合中添加的元素 , o2代表的是集合中已经存在的元素,排序原理与自然排序相同!
 *
 *
 * */

public class TreeSetDemo {
    public static void main(String[] args) {
        // treeSetBase(treeSet);
        // ZiYanSort();

        BiJiaoQiSort();

    }

    private static void BiJiaoQiSort() {

        //TreeSet<Teacher> treeSet = new TreeSet<>(new ComparatorImpl());

        // 匿名内部类方式
        TreeSet<Teacher> treeSet = new TreeSet<>(new Comparator<Teacher>() {
            @Override
            public int compare(Teacher o1, Teacher o2) {
                int res = o1.getAge() - o2.getAge();

                return res == 0 ? o1.getName().compareTo(o2.getName()) : res;
            }
        });

        treeSet.add(new Teacher("1", 18));
        treeSet.add(new Teacher("2", 19));
        treeSet.add(new Teacher("6", 20));
        treeSet.add(new Teacher("4", 20));

        for (Teacher t : treeSet) {
            System.out.println(t);
        }
    }

    private static void ZiYanSort() {
        TreeSet<Stud1> treeSet = new TreeSet<>();

        Stud1 s1 = new Stud1("张三", 18);
        Stud1 s2 = new Stud1("王五", 19);
        Stud1 s3 = new Stud1("赵四", 20);
        Stud1 s4 = new Stud1("赵四1", 20);

        treeSet.add(s1);
        treeSet.add(s2);
        treeSet.add(s3);
        treeSet.add(s4);

        for (Stud1 s : treeSet) {
            System.out.println(s);
        }
    }

    private static void treeSetBase() {
        TreeSet<Integer> treeSet = new TreeSet<>();
        treeSet.add(3);
        treeSet.add(2);
        treeSet.add(1);

        for (int i : treeSet) {
            System.out.println(i);
        }
    }
}
// 自然排序
class Stud1 implements Comparable<Stud1> {
    private String name;
    private int age;

    public Stud1() {
    }

    public Stud1(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Stud1{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }

    @Override
    public int compareTo(Stud1 o) {
        int res = this.age - o.age;

        return res == 0 ? this.name.compareTo(o.name) : res;
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

// 比较器排序
class ComparatorImpl implements Comparator<Teacher> {
    @Override
    public int compare(Teacher o1, Teacher o2) {
        int res = o1.getAge() - o2.getAge();

        return res == 0 ? o1.getName().compareTo(o2.getName()) : res;

    }
}
class Teacher {
    private String name;
    private int age;

    public Teacher() {
    }

    public Teacher(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public String toString() {
        return "Teacher{" +
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

