package IO流.字符流;

import javax.imageio.IIOException;
import java.io.FileNotFoundException;
import java.io.FileReader;
import java.io.FileWriter;
import java.io.IOException;

/**
 * Reader类 : 读取字符流的最顶层的类 , 是一个抽象类 ,不能实例化
 * 需要使用其子类FileReader类
 *
 * FileReader类 : 用来读取字符文件的便捷类
 *
 * 构造方法 :
 *   public FileReader(File file) : 从指定的File路径中读取数据
 *   public FileReader(String fileName) : 从指定的String路径中读取数据
 *
 * int read() 一次读一个字符数据
 * int read(char[] cbuf) 一次读一个字符数组数据
 *
 * */
public class 字符输入流 {
    public static void main(String[] args) {
        try (
                FileReader fr = new FileReader("JavaSE/aaa/a.txt");
                FileWriter fw = new FileWriter("JavaSE/aaa/c.txt");
        ) {
            char[] ch = new char[1024];
            int len;
            while ((len = fr.read(ch)) != -1) {
                fw.write(ch, 0, len);
                fw.flush();
            }
        } catch (FileNotFoundException e) {
            e.printStackTrace();
        } catch (IOException e) {
            e.printStackTrace();
        }
    }
}
