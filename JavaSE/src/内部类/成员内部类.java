package 内部类;

/**
 *      两个事物存在包含关系，就可以使用内部类
 *
 *      例如：人 与 心；汽车 与 引擎关系。
 *
 *
 * */

public class 成员内部类 {
    public static void main(String[] args) {
        // 访问内部类
        Person.Heart heart = new Person().new Heart();
        heart.show();
    }
}

class Person {
    private int age = 10;

    public void show() {
        // 外部类访问内部类
        Heart heart = new Heart();

        System.out.println(heart.age);
    }

    class Heart {
        private int rate;
        private int age = 20;

        public void beats() {
            System.out.println("ddd~");
        }

        public void show() {
            int age = 30;

            System.out.println(age);
            System.out.println(this.age);
            // 内部类访问外部类
            System.out.println(Person.this.age);
        }
    }
}

