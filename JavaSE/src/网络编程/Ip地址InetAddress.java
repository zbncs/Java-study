package 网络编程;

import java.net.InetAddress;
import java.net.UnknownHostException;

/**
 * InetAddress：此类表示Internet协议（IP）地址
 *
 *      static InetAddress getByName (String host) 在给定主机名的情况下获取InetAddress类的对象
 *      String getHostName () 获取此 IP 地址的主机名
 *      String getHostAddress () 返回 IP 地址字符串（以文本表现形式）。
 * */

public class Ip地址InetAddress {
    public static void main(String[] args) throws UnknownHostException {
        InetAddress address = InetAddress.getByName("192.168.1.2");
        System.out.println(address.getHostName());
        System.out.println(address.getHostAddress());
    }
}
