package IO流.字符流.字符缓冲流;

import java.io.*;

/**
 *BufferedWriter：
 * void newLine()：写一个行分隔符，会根据操作系统的不同,写入不同的行分隔符
 *
 * BufferedReader：
 * public String readLine() ：读取文件一行数据, 不包含换行符号 ,  读到文件的末尾返回null
 *
 * */

/**
 *         远桥之下泛莲舟
 *         岱岩石上松溪流
 *         万仞翠山梨亭在
 *         莫闻空谷声悠悠
 *
 * */
public class 字符缓冲流特有的方法 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("JavaSE/aaa/c.txt"));

        String res;
        while ((res = br.readLine()) != null) {
            System.out.println(res);
        }
    }

    private static void newLine() throws IOException {
        BufferedWriter bw = new BufferedWriter(new FileWriter("JavaSE/aaa/c.txt"));

        bw.write("远桥之下泛莲舟");
        bw.newLine();
        bw.write("岱岩石上松溪流");
        bw.newLine();
        bw.write("万仞翠山梨亭在");
        bw.newLine();
        bw.write("莫闻空谷声悠悠");

        bw.close();
    }
}
