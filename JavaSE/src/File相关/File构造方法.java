package File相关;

import java.io.File;

/**
 *
 * File(String pathname)：通过将给定的路径名字符串转换为抽象路径名来创建新的 File实例
 * File(String parent, String child)：从父路径名字符串和子路径名字符串创建新的 File实例
 * File(File parent, String child)：从父抽象路径名和子路径名字符串创建新的 File实例
 *
 * */
public class File构造方法 {
    public static void main(String[] args) {
        File file = new File("/abv/a.txt");
        //System.out.println(file);

        File file1 = new File("/abv", "a.txt");
        //System.out.println(file1);

        File file2 = new File(new File("/abv"), "a.txt");
        System.out.println(file2);
    }
}
