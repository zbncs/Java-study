package IO流.文件copy;

import java.io.FileInputStream;
import java.io.FileOutputStream;
import java.io.IOException;

public class Copy {
    public static void main(String[] args) throws IOException {
        FileInputStream fis = new FileInputStream("JavaSE/aaa/bbb.txt");
        FileOutputStream fos = new FileOutputStream("JavaSE/aaa/a1.txt");

        int by;
        while ((by = fis.read()) != -1) {
            fos.write(by);
        }

        fis.close();
        fos.close();
    }
}
