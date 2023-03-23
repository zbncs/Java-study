package 网络编程.Tcp;

import java.io.IOException;
import java.io.InputStream;
import java.net.ServerSocket;
import java.net.Socket;

public class Tcp服务端 {
    public static void main(String[] args) throws IOException {
        ServerSocket serverSocket = new ServerSocket(10086);
        // 该方法会一直阻塞直到建立连接
        Socket accept = serverSocket.accept();

        // 获取网络中的输入流，用来读取客户端发送过来的数据
        InputStream inputStream = accept.getInputStream();

        int by;
        while ((by = inputStream.read()) != -1) {
            System.out.println((char) by);
        }

        // 服务端一般不会关闭
        inputStream.close();
        accept.close();
        serverSocket.close();
    }
}
