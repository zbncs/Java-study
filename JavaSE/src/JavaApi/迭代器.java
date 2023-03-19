package JavaApi;

import java.util.ArrayList;
import java.util.Collection;
import java.util.Iterator;

/**
 *  Iterator 接口：学习迭代器的目的就是为了遍历集合
 *
 *  迭代器 = 集合.iterator();
 *
 * 注意：
 * 1.当迭代器迭代元素完成后，不能继续next获取元素，否则会报：NoSuchElementException
 * 2.当迭代器在使用的过程中，不能使用集合对象直接增删元素。
 *  会导致报错ConcurrentModificationException。如果要删除可以使用迭代器来删除: remove()
 *
 *
 * */
public class 迭代器 {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("1");
        c.add("2");
        c.add("3");
        Iterator<String> it = c.iterator();

        while (it.hasNext()) {
            String s = it.next();
            System.out.println(s);
        }
    }
}
