package IO流;

import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;

public class 字节输出流换行和追加 {
    public static void main(String[] args) throws IOException {
        FileOutputStream fos = new FileOutputStream("JavaSE/aaa/bbb/b.txt", true);

        for (int i = 0; i < 10; i++) {
            fos.write("hello".getBytes());
            fos.write("\r".getBytes());
        }

        fos.close();
    }
}
