package 泛型数据结构List接口Set接口.Set接口;

import java.util.LinkedHashSet;

/**
 * LinkedHashSet类
 *
 * LinkedHashSet底层由链表结构和哈希表结构。
 * 链表结构：是为了保证插入顺序
 * 哈希表结构：是为了去重
 *
 *
 * */

public class LinkedHashSetDemo {
    public static void main(String[] args) {
        LinkedHashSet<Integer> linkedHashSet = new LinkedHashSet<>();

        linkedHashSet.add(0);
        linkedHashSet.add(0);
        linkedHashSet.add(1);
        linkedHashSet.add(2);

        System.out.println(linkedHashSet);
    }
}




