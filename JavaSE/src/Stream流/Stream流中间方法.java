package Stream流;

import java.util.ArrayList;
import java.util.Collections;
import java.util.stream.Stream;

/**
 *Stream<T> filter(Predicate predicate)：用于对流中的数据进行过滤
 *
 * Predicate接口中的方法:
 * boolean test(T t)：对给定的参数进行判断，返回一个布尔值
 *
 * Stream<T> limit(long maxSize)：截取指定参数个数的数据(前几个数据)
 * Stream<T> skip(long n)：跳过指定参数个数的数据
 * static <T> Stream<T> concat(Stream a, Stream b)：合并a和b两个流为一个流
 * Stream<T> distinct()：去除流中重复的元素。依赖(hashCode和equals方法, 类需要重写这两种方法)
 * Stream<T> sorted () : 将流中元素按照自然排序的规则排序
 * Stream<T> sorted (Comparator<? super T> comparator) : 将流中元素按照自定义比较器规则排序
 *
 * */

public class Stream流中间方法 {
    public static void main(String[] args) {
        ArrayList<String> list = new ArrayList<>();

        Collections.addAll(list, "1", "2", "3", "2");

        // filter
        //list.stream().filter(s -> s != "1").forEach(s -> System.out.println(s));
        // limit
        //list.stream().limit(2).forEach(s -> System.out.println(s));
        // skip
        //list.stream().skip(2).forEach(s -> System.out.println(s));
        // concat
        //Stream.concat(list.stream(), list.stream()).forEach(s -> System.out.println(s));
        // distinct
        //list.stream().distinct().forEach(s -> System.out.println(s));
        // sorted
        //Stream.of(1, 0, 4, 3, 9, 6).sorted((a, b) -> b -a).forEach(s -> System.out.println(s));
    }
}
