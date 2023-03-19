package JavaApi;

import java.util.ArrayList;
import java.util.Collection;

/**
 * 只能遍历数组和单例集合
 *  缺点：没有索引，遍历的目标不能为null;
 *
 * */

public class 增强for {
    public static void main(String[] args) {
        Collection<String> c = new ArrayList<>();
        c.add("6");
        c.add("6");
        c.add("6");
        c.add("6");
        c.add("6");
        for (String item : c) {
            System.out.println(item);
        }
    }
}
