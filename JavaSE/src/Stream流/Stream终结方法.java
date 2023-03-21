package Stream流;

import java.util.ArrayList;
import java.util.Collections;

/**
 *void forEach(Consumer action)：对此流的每个元素执行操作
 * Consumer接口中的方法	void accept(T t)：对给定的参数执行此操作
 *
 * long count()：返回此流中的元素数
 *
 * */

public class Stream终结方法 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3", "2");

        list.stream().forEach(s -> {
            s = s + "666";

        });

        System.out.println(list);
    }
}
