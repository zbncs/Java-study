package JavaApi;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Collection;

/**
 *  集合体系
 *         1 单列集合 : Collection接口
 *             List接口 : 1 有序  2 有索引   3 元素可以重复
 *                 ArrayList类  : 数组结构(查询快 , 增删慢)
 *                 LinkedList类 : 链表结构(查询慢 , 增删快)
 *             Set接口  : 1 无序  2 无索引   3 元素唯一
 *                 HashSet类 : 哈希表结构(保证数据唯一 , 查询速度快)
 *                 TreeSet类 : 红黑树结构(可以对元素进行排序)
 *
 *         单列集合的遍历方式
 *             1 迭代器       : 所有的单列集合
 *             2 增强for      : 所有的单列集合
 *             3 普通for      : 只能遍历List体系
 *
 *         2 双列集合 : Map接口
 *                 HashMap类 : 哈希表结构(保证键唯一 , 查询速度快)
 *                 TreeMap类 : 红黑树结构(可以对键进行排序)
 *
 *
 * */

public class Collection集合 {
    public static void main(String[] args) {
        // Collection 是一个接口，找他的实现类ArrayList
        Collection<String> c = new ArrayList<>();

        // public boolean add(E e): 把给定的对象添加到当前集合中,e是泛型
        c.add("张");
        c.add("张1");
        c.add("张2");
        c.add("张3");
        // clear()：清空
        // c.clear();
        // size
        System.out.println(c.size());

        // contains()：判断集合中是否包含某个对象
        System.out.println(c.contains("张"));
        // isEmpty()
        System.out.println(c.isEmpty());
        // toArray() : 把集合中的元素保存在数组中
        System.out.println(Arrays.toString(c.toArray()));

    }
}
