package IO流.输入流;

import java.io.FileInputStream;
import java.io.FileNotFoundException;
import java.io.IOException;

public class 输入流 {
    public static void main(String[] args) throws IOException {
        // 创建字节输入流对象
        /**
         * 一次读取一个字符
         * 字节输入流指向文件不存在，报错
         *
         * */
        FileInputStream fis = new FileInputStream("JavaSE/aaa/bbb.txt");

//        int read = fis.read();
//        System.out.println((char) read);

        simplyFn(fis);

        while (true) {
            int by = fis.read();
            if (by == -1) {
                break;
            }
            System.out.print((char) by);
        }

        //
        fis.close();
    }

    private static void simplyFn(FileInputStream fis) throws IOException {
        int by;
        while ((by = fis.read()) != -1) {
            System.out.print((char) by);
        }
    }
}
