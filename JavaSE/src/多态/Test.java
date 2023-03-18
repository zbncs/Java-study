package 多态;

public class Test {
    public static void main(String[] args) {
        Animal a = new Dog();
    }
}

abstract class Animal {
    public abstract void eat();
}

class Dog extends Animal {

    @Override
    public void eat() {
        System.out.println("狗吃肉");
    }
}
