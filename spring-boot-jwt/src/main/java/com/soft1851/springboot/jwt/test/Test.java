package com.soft1851.springboot.jwt.test;

import com.auth0.jwt.interfaces.DecodedJWT;

import java.text.SimpleDateFormat;
import java.util.Calendar;

/**
 * @author xunmi
 * @ClassName Test
 * @Description TODO
 * @Date 2020/4/15
 * @Version 1.0
 **/
public class Test {
    public static void main(String[] args) {
        // 生成token
        Encrypt encrypt = new Encrypt();
        String token = encrypt.getToken(true, "soft1851", "软件1851");

        // 打印token
        System.out.println("token: " + token);

        // 解密token
        Decrypt decrypt = new Decrypt();
        DecodedJWT jwt = decrypt.deToken(token);

        // 过期时间
        Calendar expires = Calendar.getInstance();
        System.out.println(jwt.getExpiresAt());
        expires.setTime(jwt.getExpiresAt());
        System.out.println("当前Token的基本信息如下：");
        SimpleDateFormat formatter = new SimpleDateFormat("yyyy-MM-dd HH:mm:ss");
        System.out.println("issuer: " + jwt.getIssuer());
        System.out.println("isVip:  " + jwt.getClaim("isVip").asBoolean());
        System.out.println("username: " + jwt.getClaim("username").asString());
        System.out.println("name:     " + jwt.getClaim("name").asString());
        System.out.println("过期时间：      " + formatter.format(jwt.getExpiresAt()));


        Runnable thread = new ThreadTime(expires);
        while (true) {
            new Thread(thread).start();
        }

    }
}

class ThreadTime implements Runnable {

    private Calendar calendar;

    public ThreadTime(Calendar calendar) {
        this.calendar = calendar;
    }

    @Override
    public void run() {
        isAfter();
    }

    public synchronized void isAfter() {
        Calendar instance = Calendar.getInstance();
        if (!calendar.after(instance)) {
            System.out.println("当前Token已经失效了哟，请重新登录");
            System.exit(-1);
        }
    }
}
