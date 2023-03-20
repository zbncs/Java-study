package 泛型数据结构集合;

import java.util.ArrayList;

public class 受限泛型 {
    public static void main(String[] args) {
        /**
         * 泛型的下限
         *  <? super 类型>	只能是某一类型，及其父类型，其他类型不支持
         * 泛型的上限
         * <? extends 类型>	只能是某一个类型，及其子类型，其他类型不支持
         *
         * */

        ArrayList<Integer> list = new ArrayList<>();
        ArrayList<Object> list1 = new ArrayList<>();
        ArrayList<String> list2 = new ArrayList<>();
        ArrayList<Number> list3 = new ArrayList<>();

        //show(list);
        show(list1);
        //show(list2);
        show(list3);

        show1(list);
        //show1(list1);
        //show1(list2);
        show1(list3);
    }

    public static void show(ArrayList<? super Number> list) {
        // 只能接收Number及其父类型
    }

    public static void show1(ArrayList<? extends Number> list) {
        // 只能接收Number及其子类型
    }
}
