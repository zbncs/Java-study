package IO流.序列化;

import java.io.*;

/**
 *对象操作输出流（对象序列化流）   ：就是将对象写到本地文件中，或者在网络中传输对象
 * 对象操作输入流（对象反序列化流）：把写到本地文件中的对象读到内存中，或者接收网络中传输的对象
 *
 * ObjectOutputStream (OutputStream out)
 *      writeObject(Object obj)
 *
 * ObjectInputStream (InputStream in)
 *          readObject()
 *
 *
 * */
public class 序列化与反序列化 {
    public static void main(String[] args) throws IOException, ClassNotFoundException {
        //serialize();
        ObjectInputStream ois = new ObjectInputStream(new FileInputStream("JavaSE/aaa/obj.txt"));

        Object o = ois.readObject();
        System.out.println(o.toString());
        ois.close();
    }

    private static void serialize() throws IOException {
        ObjectOutputStream oos = new ObjectOutputStream(new FileOutputStream("JavaSE/aaa/obj.txt"));
        oos.writeObject(new Person("小明", 18));
        oos.close();
    }
}

class Person implements Serializable {
    private String name;
    private  int age;

    public Person() {
    }

    public Person(String name, int age) {
        this.name = name;
        this.age = age;
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

    @Override
    public String toString() {
        return "Person{" +
                "name='" + name + '\'' +
                ", age=" + age +
                '}';
    }
}
