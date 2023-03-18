package 枚举;

/**
 *  枚举本质就是一个final类，不能被继承，每一项就是一个对象
 *  构造函数只能是私有的
 *
 *  实例方法：使用枚举项调用
 * */
public class Enum {
    public static void main(String[] args) {
        System.out.println(Sex.BOY);

        // values()
        Sex[] arr = Sex.values();

        for (int i = 0; i < arr.length; i++) {
            System.out.println(arr[i]);
        }

        // 使用枚举项调用
        Sex.BOY.show(); // null
        Sex.GIRL.show(); // 女


    }
}

enum Sex {
    BOY, GIRL("女");

    private String name;

    private Sex() {}

    private Sex(String name) {
        this.name = name;
    }

    public void show() {
        System.out.println(name);
    }


}
