package 网络编程.Tcp;

import java.io.IOException;
import java.io.OutputStream;
import java.net.Socket;

public class Tcp客户端 {
    public static void main(String[] args) throws IOException {
        Socket socket = new Socket("127.0.0.1", 10086);

        OutputStream outputStream = socket.getOutputStream();

        outputStream.write("hello".getBytes());
        outputStream.flush();

        outputStream.close();
        socket.close();
    }
}
