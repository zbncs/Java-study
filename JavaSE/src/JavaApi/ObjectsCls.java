package JavaApi;

import java.util.Objects;

// Objects.equals(a, b)，还是得重写equals

public class ObjectsCls {
    public static void main(String[] args) {
        Students s = new Students("zs", 18);
        Students s1 = new Students("zs", 18);

        System.out.println(Objects.equals(s, s1));
    }
}

class Students {
    private String name;
    private int age;

    public Students() {
    }

    public Students(String name, int age) {
        this.name = name;
        this.age = age;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        Students students = (Students) o;
        return age == students.age && Objects.equals(name, students.name);
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getAge() {
        return age;
    }

    public void setAge(int age) {
        this.age = age;
    }
}
