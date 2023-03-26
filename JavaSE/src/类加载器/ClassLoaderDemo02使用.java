package 类加载器;

import java.io.IOException;
import java.io.InputStream;
import java.util.Properties;

public class ClassLoaderDemo02使用 {
    public static void main(String[] args) throws IOException {
        Properties properties = new Properties();

        // 使用类加载器加载配置文件
        Class<ClassLoaderDemo02使用> aClass = ClassLoaderDemo02使用.class;
        ClassLoader loader = aClass.getClassLoader();
        // 相对路径：相对于src路径
        InputStream resourceAsStream = loader.getResourceAsStream("stu.ini");
        properties.load(resourceAsStream);

        String name = properties.getProperty("name");
        String age = properties.getProperty("age");

        System.out.println(name + age);
    }
}
