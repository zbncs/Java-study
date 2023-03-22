package IO流.字符流.字符缓冲流;

import java.io.*;

public class 字符缓冲流 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("JavaSE/aaa/a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("JavaSE/aaa/c.txt"));

        char[] ch = new char[1024];
        int len;
        while ((len = br.read(ch)) != -1) {
            bw.write(ch, 0, len);
            /**
             * 这个是缓冲区的问题.
             * java在使用流时,都会有一个缓冲区,按一种它认为比较高效的方法来发数据:把要发的数据先放到缓冲区,缓冲区放满以后再一次性发过去,而不是分开一次一次地发.
             * 而flush()表示强制将缓冲区中的数据发送出去,不必等到缓冲区满.
             *
             * 所以如果在用流的时候,没有用flush()这个方法,很多情况下会出现流的另一边读不到数据的问题,特别是在数据特别小的情况下.
             *
             * */
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
