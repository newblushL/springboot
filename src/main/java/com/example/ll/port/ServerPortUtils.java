package com.example.ll.port;

import java.util.Random;

/**
 * @description: 服务端口工具类
 * @author: ll
 * @create: 2019-07-28 19:10
 */
public class ServerPortUtils {

    public static int getAvailablePort(){
        int max = 65535;
        int min = 2000;
        Random random = new Random();
        int port = random.nextInt(max)%(max-min+1) + min;
        boolean using = NetUtils.isLocalPortUsing(port);
        if(using){
            return getAvailablePort();
        }else{
            return port;
        }
    }
}