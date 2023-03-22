package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节流写output {
    public static void main(String[] args) throws IOException {
        // 创建字节输出流对象
        /**
         * 如果字节输出流指向的文件不存在，创建一个空文件
         * 存在，会把文件中数据清空
         * */
        FileOutputStream fos = new FileOutputStream("JavaSE/aaa/bbb.txt");

        // 写数据
        /**
         * void write(int b)：一次写一个字节数据
         * void write(byte[] b)：一次写一个字节数组数据
         * void write(byte[] b, int off, int len)：一次写一个字节数组的部分数据
         *
         * */
        //fos.write(97);
        //fos.write(98);
        //fos.write('c');

        byte[] b = {65, 66, 67, 68};
        //
        //fos.write(b);

        //
        //fos.write(b, 1, 2);

        byte[] bb = "hsssssfakasd".getBytes();
        fos.write(bb);

        // 释放资源
        fos.close();

    }
}
