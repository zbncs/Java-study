package IO流.字符流.字符缓冲流;

import java.io.*;
import java.util.Arrays;

public class 案例 {
    public static void main(String[] args) throws IOException {
        BufferedReader br = new BufferedReader(new FileReader("JavaSE/aaa/a.txt"));
        BufferedWriter bw = new BufferedWriter(new FileWriter("JavaSE/aaa/c.txt"));

        String content = br.readLine();
        String[] arr = content.split(" ");
        int[] intArr = new int[arr.length];
        for (int i = 0; i < arr.length; i++) {
            intArr[i] = Integer.parseInt(arr[i]);
        }
        Arrays.sort(intArr);

        for (int i = 0; i < intArr.length; i++) {
            bw.write(intArr[i] + " ");
            bw.flush();
        }

        bw.close();
        br.close();
    }
}
