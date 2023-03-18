package 代码块;

public class 构造代码块 {
    public static void main(String[] args) {
        Student s = new Student();
        Student s1 = new Student(10);
    }
}

class Student {
    final int NUM;
    private int age;

    {
        /**
         *  处理构造函数中重复的逻辑，类似 contructor()
         * */
        NUM = 10;
        System.out.println("每一次构造函数执行前都会执行");
    }

    public Student() {
        System.out.println("h");
    }

    public Student(int age) {
        this.age = age;
        System.out.println("a");
    }
}
