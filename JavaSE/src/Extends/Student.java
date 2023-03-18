package Extends;

public class Student extends Person {
    private String stuId;

    public String getStuId() {
        return stuId;
    }

    public void setStuId(String stuId) {
        this.stuId = stuId;
    }

    public void study() {
        System.out.println("学习");
    }
}
