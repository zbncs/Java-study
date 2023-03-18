package Extends;

public class ExtendsDemo {
    public static void main(String[] args) {
        Student s = new Student();
        s.setStuId("001");
        s.setName("zs");
        s.setAge(18);

        System.out.println(s.getStuId());
    }
}
