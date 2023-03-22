package File相关;

import java.io.File;
import java.io.IOException;

/**
 * public boolean isDirectory()：测试此抽象路径名表示的File是否为目录
 * public boolean isFile()：测试此抽象路径名表示的File是否为文件
 * public boolean exists()：测试此抽象路径名表示的File是否存在
 * public String getAbsolutePath()：返回此抽象路径名的 绝对路径名字符串
 * public String getPath()：将此抽象路径名转换为 路径名字符串
 * public String getName()：返回由此抽象路径名表示的文件或目录的名称
 *
 * */

public class File判断和获取功能 {
    public static void main(String[] args) throws IOException {
        File file = new File("JavaSE/aaa");
        file.mkdir();
        System.out.println(file.isDirectory());

        File file1 = new File("JavaSE/aaa/a.txt");
        file1.createNewFile();
        System.out.println(file1.isFile());
        System.out.println(file1.exists());
        System.out.println(file1.getAbsolutePath());

        System.out.println(file1.getPath());
        System.out.println(file.getPath());
        System.out.println(file1.getName());
        System.out.println(file.getName());
        System.out.println(file1.isHidden());


    }
}
