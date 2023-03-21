package Stream流;

import java.util.*;
import java.util.stream.Stream;

/**
 *
 *  单列集合
 * 	    可以使用Collection接口中的默认方法stream()生成流
 * 	    default Stream<E> stream()
 *  双列集合
 *      间接的生成流
 *      可以先通过keySet或者entrySet获取一个Set集合，再获取Stream流
 *  数组
 * 	    Arrays中的静态方法stream 生成流
 * */
public class Stream流获取方法 {
    public static void main(String[] args) {
        // 单列集合
        ArrayList<String> list = new ArrayList<>();
        Collections.addAll(list, "1", "2", "3");
        Stream<String> stream = list.stream();
        stream.forEach(s -> System.out.println(s));

        // 双列集合
        HashMap<Integer, String> hashMap = new HashMap<>();
        hashMap.put(1, "01");
        hashMap.put(2, "02");
        hashMap.put(3, "03");
        Set<Integer> keySet = hashMap.keySet();
        keySet.stream().forEach(s -> System.out.println(s + "--" + hashMap.get(s)));

        // 数组
        Integer[] arr = {1, 2, 3, 4, 5};
        Arrays.stream(arr).forEach(s -> System.out.println(s));

        // 把多个数据放入stream流
        Stream.of(1, 2, 3).forEach(s -> System.out.println(s));
    }
}
