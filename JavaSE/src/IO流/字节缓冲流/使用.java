package IO流.字节缓冲流;

import java.io.*;

public class 使用 {
    public static void main(String[] args) {
        try (
                BufferedOutputStream bos = new BufferedOutputStream(new FileOutputStream("JavaSE/aaa/a.txt"));
                BufferedInputStream bis = new BufferedInputStream(new FileInputStream("JavaSE/aaa/bbb.txt"));
        ) {
            byte[] bytes = new byte[1024];
            int len;
            while ((len = bis.read(bytes)) != -1) {
                bos.write(bytes, 0 , len);
            }
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
