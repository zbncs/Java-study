package IO流.输入流;

import java.io.FileInputStream;
import java.io.IOException;

public class 读入字节数组 {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("JavaSE/aaa/bbb.txt");
        byte[] bys = new byte[1024];
       int len;
        while ((len = fis.read(bys)) != -1) {
            System.out.println(new String(bys, 0, len));
        }
        fis.close();

    }
}
