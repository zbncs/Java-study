package Properties集合;

import java.io.BufferedOutputStream;
import java.io.FileNotFoundException;
import java.io.FileOutputStream;
import java.io.IOException;
import java.util.Properties;

/**
 * void load(InputStream inStream) 以字节流形式 , 把文件中的键值对, 读取到集合中
 * void store(OutputStream out, String comments) 把集合中的键值对,以字节流形式写入文件中 , 参数二为注释
 *
 * */
public class PrppertiesIO {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        properties.setProperty("1", "01");
        properties.setProperty("3", "03");
        properties.setProperty("5", "05");

        properties.store(new BufferedOutputStream(new FileOutputStream("JavaSE/aaa/test.properties")), "comments");

    }

}
