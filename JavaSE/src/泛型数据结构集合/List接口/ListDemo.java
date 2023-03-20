package 泛型数据结构集合.List接口;

import java.util.ArrayList;
import java.util.List;

/**
 * List集合有什么特点？
 * 1. 有序 2. 可重复的 3. 有索引
 *
 * List集合有哪些常用的子类及底层数据结构是啥？
 *  ArrayList：数组结构
 *  LinkedList：双向链表
 *  Vector : 数组结构
 *
 *  List集合有哪些常用的 特有 方法？
 *
 *  add remove set get
 *
 * */

public class ListDemo {
    public static void main(String[] args) {
        List<String> list = new ArrayList<>();

        list.add("1");
        list.add("2");
        list.add("3");
        list.add("4");
    // list 新增了一些含有索引的特有方法
        list.add(1, "5");
        System.out.println(list.remove(2));
        System.out.println(list.set(0, "6"));
        System.out.println(list.get(0));


    }
}
