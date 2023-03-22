package File相关;

import java.io.File;
import java.io.IOException;

/**
 * public boolean createNewFile(): 创建一个新的空的文件
 *public boolean mkdir() 创建一个单级文件夹
 * public boolean mkdirs()：创建一个多级文件夹
 *
 * */

public class 创建功能 {
    public static void main(String[] args) throws IOException {
        File file = new File("JavaSE/a.txt");
        file.createNewFile();
    }
}
