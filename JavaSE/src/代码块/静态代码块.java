package 代码块;

public class 静态代码块 {
    public static void main(String[] args) {
        Student1 s1 = new Student1();
        Student1 s2 = new Student1(10);
    }
}

class Student1 {
    private int age;
    private static int b;

    static {
        /**
         * 类似 componentDidMount： 可以给静态成员初始化赋值
         * */
        b = 10;
        System.out.println("构造函数执行前，只执行一次");
    }

    public Student1() {
        System.out.println("h");
    }

    public Student1(int age) {
        this.age = age;
        System.out.println("a");
    }
}

