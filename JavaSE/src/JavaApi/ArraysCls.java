package JavaApi;

import java.util.Arrays;

/**
 *  Arrays: 操作数组方法
 *
 * */

public class ArraysCls {
    public static void main(String[] args) {
        int[] arr = {3, 5, 1, 7, 3, 2, 9};

        System.out.println(Arrays.toString(arr));

        // 没有返回值
        Arrays.sort(arr);

        System.out.println(Arrays.toString(arr));
    }
}
