package Stream流;

import java.util.*;
import java.util.stream.Collector;
import java.util.stream.Collectors;
import java.util.stream.Stream;

public class stream收集方法 {
    public static void main(String[] args) {
        // 在Stream流中无法直接修改集合,数组中的数据。所以需要收集方法
        //Stream.of(1, 2, 3, 4, 5, 6, 7, 8, 9, 10).filter(s -> s % 2 == 0).forEach(s -> System.out.println(s));

        /**
         * Stream流的收集方法
         * R collect(Collector collector) : 此方法只负责收集流中的数据 , 创建集合添加数据动作需要依赖于参数
         *
         * 工具类Collectors提供了具体的收集方式
         *
         * public static <T> Collector toList()：把元素收集到List集合中
         * public static <T> Collector toSet()：把元素收集到Set集合中
         * public static  Collector toMap(Function keyMapper,Function valueMapper)：把元素收集到Map集合中
         *
         * */
        ArrayList<Integer> list = new ArrayList<>();
        Collections.addAll(list, 1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

        Collector<Object, ?, List<Object>> listCollector = Collectors.toList();
        List<Object> list1 = list.stream().filter(v  -> v % 2 == 0).collect(listCollector);
        //System.out.println(list1);

        Set<Integer> collect = list.stream().skip(4).collect(Collectors.toSet());
        //System.out.println(collect);

        // toMap
        ArrayList<String> list2 = new ArrayList<>();
        Collections.addAll(list2, "张三,23", "lisi,24", "wangwu,25");

        Map<String, String> stringMap = list2.stream().filter(v -> {
            int age = Integer.parseInt(v.split(",")[1]);
            return age >= 24;
        }).collect(Collectors.toMap(k -> k.split(",")[0], v -> v.split(",")[1]));

        System.out.println(stringMap);
    }
}
