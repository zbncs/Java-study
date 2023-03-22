package File相关;

import java.io.File;

/**
 * public File[] listFiles(): 返回此抽象路径名表示的目录中的文件和目录的File对象数组
 *
 * listFiles方法注意事项：
 * 当调用者不存在时，返回null
 * 当调用者是一个文件时，返回null
 * 当调用者是一个空文件夹时，返回一个长度为0的数组
 * 当调用者是一个有内容的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回
 * 当调用者是一个有隐藏文件的文件夹时，将里面所有文件和文件夹的路径放在File数组中返回，包含隐藏内容
 *
 * */

public class File类的高级获取功能 {
    public static void main(String[] args) {
        File file = new File("JavaSE/aaa");

        File[] files = file.listFiles();
        System.out.println(files.length);

        for (File f: files) {
            System.out.println(f.getName());
        }
    }
}
