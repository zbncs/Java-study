package 代码块;

public class 局部代码块 {
    public static void main(String[] args) {
        Student2 s = new Student2();
        s.test();

    }
}

/**
 * 任何位置都可以定义局部代码块
 * 常用于定义在方法内部
 * */

class Student2 {
    private int age;

    public Student2() {
        System.out.println("h");
    }

    public Student2(int age) {
        this.age = age;
        System.out.println("a");
    }

    public void test() {
        int a = 10;
        {
            /**
             *  限制作用域，执行完毕后，释放内存
             * */
            int b = 100;
            a = 20;
            System.out.println(a);
            System.out.println(b);
        }

        System.out.println(a);
//        System.out.println(b);
    }

}
