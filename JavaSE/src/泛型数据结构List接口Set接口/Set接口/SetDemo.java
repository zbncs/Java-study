package 泛型数据结构List接口Set接口.Set接口;

// Set集合没有特有的方法

import java.util.HashSet;
import java.util.Iterator;
import java.util.Set;

/**
 * Set比Collection定义更严谨，Set集合要求：
 * 元素不能保证添加和取出顺序（无序）
 * 元素是没有索引的(无索引)
 * 元素唯一(元素唯一)
 *
 * 2 Set常用子类?
 *
 * HashSet：底层结构哈希表结构。
 * 具有特点 : 去重，无索引，无序特点。
 * 哈希表结构的集合，操作效率会非常高。
 *
 * LinkedHashSet: 底层结构链表加哈希表结构。
 * 具有哈希表表结构的特点，也具有链表的特点。
 *
 * TreeSet：底层数据结构红黑树。
 * 具有特点 : 去重 , 排序的功能
 *
 * */
public class SetDemo {
    public static void main(String[] args) {
        Set<String> set = new HashSet<>();

        set.add("1");
        set.add("2");
        set.add("3");

        Iterator<String> it = set.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }

        for (String item : set) {
            System.out.println(item);
        }

    }
}
