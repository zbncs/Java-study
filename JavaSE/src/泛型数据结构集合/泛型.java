package 泛型数据结构集合;

public class 泛型 {
    public static void main(String[] args) {
        Person<String> p = new Person<>();
    }
}

class Person<X> {
    X hobby;

    public Person() {
    }

    public Person(X hobby) {
        this.hobby = hobby;
    }

    public X getHobby() {
        return hobby;
    }

    public void setHobby(X hobby) {
        this.hobby = hobby;
    }

    @Override
    public String toString() {
        return "Person{" +
                "hobby=" + hobby +
                '}';
    }
}


