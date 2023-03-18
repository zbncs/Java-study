package JavaApi;

// System 都是静态方法，不能被实例化
public class SystemCls {
    public static void main(String[] args) {
//        System.exit(0); // 终止当前虚拟机运行
        show();
        System.out.println("show结束");
    }

    /**
     *  break: 结束循环
     *
     *  return: 结束函数执行
     *
     *  System.exit(0)：直接终止虚拟机
     *
     * */

    public static void show() {
        for (int i = 0; i < 10; i++) {
            if (i == 3) {
                // break;
                // return;
                System.exit(0);
            }
            System.out.println(i);
        }
        System.out.println("循环结束");
    }
}
