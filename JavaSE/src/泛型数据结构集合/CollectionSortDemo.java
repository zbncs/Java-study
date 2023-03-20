package 泛型数据结构集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.Comparator;

/**
 * public static <T extends Comparable> void sort (List<T> list) : 集合中元素 **自然排序** 了,可以使用此方法
 * public static <T> void  sort (List<T> list, Comparator<? super T> c) : 对集合中的元素指定 **比较器排序**
 *
 *
 * */

public class CollectionSortDemo {
    public static void main(String[] args) {
        ArrayList<Integer> arrayList = new ArrayList<>();
        arrayList.add(3);
        arrayList.add(1);
        arrayList.add(0);
        arrayList.add(9);

        //Collections.sort(arrayList);

        Collections.sort(arrayList, new Comparator<Integer>() {
            @Override
            public int compare(Integer o1, Integer o2) {
                return o2 - o1;
            }
        });

        for (int i = 0; i < arrayList.size(); i++) {
            int it = arrayList.get(i);
            System.out.println(it);
        }
    }
}
