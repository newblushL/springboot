package com.example.ll.port;

import java.io.IOException;
import java.net.InetAddress;
import java.net.Socket;

/**
 * @description: Socket检查端口是否被占用类
 * @author: ll
 * @create: 2019-07-28 19:16
 */
public class NetUtils {

    /**
    *@Description: 测试本机端口是否被使用
    *@Param:
    *@return:
    *@Author: ll
    *@date: 2019-07-28
    */
    public static boolean isLocalPortUsing(int port){
        boolean flag = true;
        try{
            flag = isPortUsing("127.0.0.1",port);
        }catch (Exception e){
            //
        }
        return flag;

    }

    /**
    *@Description: 测试主机Host的port端口是否被使用
    *@Param:
    *@return:
    *@Author: ll
    *@date: 2019-07-28
    */
    private static boolean isPortUsing(String host, int port) {
        boolean flag = false;
        try {
            InetAddress address = InetAddress.getByName(host);
            //建立socket链接
            Socket socket = new Socket(address, port);
            flag = true;
        } catch (IOException e) {
            e.printStackTrace();
        }
        return flag;
    }
}