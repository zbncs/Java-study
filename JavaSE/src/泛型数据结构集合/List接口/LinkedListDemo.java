package 泛型数据结构集合.List接口;

import java.util.LinkedList;
/**
 *
 * 2 LinkedList 特有 方法
 * public void addFirst(E e):将指定元素插入此列表的开头。
 * public void addLast(E e):将指定元素添加到此列表的结尾。
 * public E getFirst():返回此列表的第一个元素。
 * public E getLast():返回此列表的最后一个元素。
 * public E removeFirst():移除并返回此列表的第一个元素。
 * public E removeLast():移除并返回此列表的最后一个元素。
 *
 * */
public class LinkedListDemo {
    public static void main(String[] args) {
        // 双向链表
        LinkedList<String> list = new LinkedList<>();

        list.add("1");
        list.add("2");
        list.add("3");

        list.addFirst("5");
        list.removeFirst();
    }
}
