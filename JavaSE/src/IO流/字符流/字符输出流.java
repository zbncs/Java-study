package IO流.字符流;

import java.io.FileWriter;
import java.io.IOException;

/**
 * FileWriter类 : 用来写入字符文件的便捷类
 *
 * 构造方法 :
 *   public FileWriter(File file) : 往指定的File路径中写入数据
 *   public FileWriter(String fileName) : 往指定的String路径中写入数据
 *
 *
 *   void write (int c)：写一个字符
 *   void write (char[] cbuf)：写入一个字符数组
 *   void write (char[] cbuf, int off, int len)：写入字符数组的一部分
 *   void write (String str)：写一个字符串
 *   void write (String str, int off, int len)：写一个字符串的一部分
 *
 *   flush()：刷新流，还可以继续写数据
 *   close()：关闭流，释放资源，但是在关闭之前会先刷新流。一旦关闭，就不能再写数据
 *
 * */

public class 字符输出流 {
    public static void main(String[] args) throws IOException {
        // 没有目标文件就创建，要保证父级文件存在
        // 文件有内容就覆盖
        FileWriter fw = new FileWriter("JavaSE/aaa/charWrite.txt");

        //writeChar(fw);

        //writeString(fw);

        fw.write('1');
        fw.flush();
        fw.write('3');
        fw.flush();
        fw.close();
    }

    private static void writeString(FileWriter fw) throws IOException {
        // 写入字符串
        //fw.write("poiuy哈哈哈😁");
        fw.write("我是一个字符串😝", 0, 6);
        fw.flush();
    }

    private static void writeChar(FileWriter fw) throws IOException {
        // 写入字符
        //        fw.write('a');
//        fw.write('b');
//        fw.write('c');
        char[] ch = {'a', 'c', 'd', 'e'};
//        fw.write(ch);

        fw.write(ch, 1, 3);
        fw.flush();
    }
}
