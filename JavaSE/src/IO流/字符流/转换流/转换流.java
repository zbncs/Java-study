package IO流.字符流.转换流;

import java.io.*;

/**
 *转换流就是来进行字节流和字符流之间转换的
 *
 * InputStreamReader 是从字节流到字符流的桥梁
 * OutputStreamWriter 是从字符流到字节流的桥梁
 *
 * OutputStreamWriter(OutputStream out) 创建使用默认字符编码集(utf-8)的OutputStreamWriter
 * OutputStreamWriter(OutputStream out, String charsetName): 创建使用指定字符集的OutputStreamWriter
 *
 * InputStreamReader(InputStream i)
 *
 * InputStreamReader(InputStream i, String charsetName)
 *
 * */
public class 转换流 {
    public static void main(String[] args) throws IOException {
        writeStream("GBK");
        InputStreamReader isr = new InputStreamReader(new FileInputStream("JavaSE/aaa/c.txt"), "GBK");

        int len;
        while ((len = isr.read()) != -1) {
            System.out.println((char) len);
        }

        isr.close();
    }

    private static void writeStream(String charset) throws IOException {
        OutputStreamWriter osw = new OutputStreamWriter(new FileOutputStream("JavaSE/aaa/c.txt"), charset);

        osw.write("你好");
        osw.flush();

        osw.close();
    }
}
