package 泛型数据结构集合;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class ShuffleSort {
    public static void main(String[] args) {
        List<Integer> list = new ArrayList<>();
        list.add(1);
        list.add(3);
        list.add(5);
        list.add(7);
        // public static void shuffle(List<?> list) 对集合中的元素进行打乱顺序。
        /**
         * 使用该方法需要注意的：
         *  乱序只能对List集合进行乱序
         *  集合中元素类型可以任意类型
         *
         * */
        Collections.shuffle(list);

        for (int i : list) {
            System.out.println(i);
        }
    }
}
