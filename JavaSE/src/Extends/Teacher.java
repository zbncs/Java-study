package Extends;

public class Teacher extends Person {
    private String id;

    public String getId() {
        return id;
    }

    public void setId(String id) {
        this.id = id;
    }

    public void teach() {
        System.out.println("讲课");
    }
}
