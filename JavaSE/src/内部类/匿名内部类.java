package 内部类;

// 没有类名

// new 抽象类名/接口名() {
//  重写方法
// }

public class 匿名内部类 {
    public static void main(String[] args) {
//        useSwimming(new SwimmingImpl());

        // 匿名内部类
        useSwimming(new Swimming() {
            @Override
            public void swim() {
                System.out.println("去游泳");
            }
        });

        // 或者这么写
        useSwimming(() -> System.out.println("去游泳"));
    }

    public static void useSwimming(Swimming swimming) {
        swimming.swim();
    }
}


interface Swimming {
    public abstract void swim();
}

//class SwimmingImpl implements Swimming {
//
//    @Override
//    public void swim() {
//        System.out.println("去游泳");
//    }
//}






