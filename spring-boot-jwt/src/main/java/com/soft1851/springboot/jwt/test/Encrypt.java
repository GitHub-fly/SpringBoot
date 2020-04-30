package com.soft1851.springboot.jwt.test;

import com.auth0.jwt.JWT;
import com.auth0.jwt.algorithms.Algorithm;

import java.util.Calendar;
import java.util.Date;
import java.util.Random;

/**
 * @author xunmi
 * @ClassName Encrypt
 * @Description TODO
 * @Date 2020/4/15
 * @Version 1.0
 **/
public class Encrypt {

    public static String secret = "";

    /**
     * 生成加密后的token
     *
     * @param isVip    是不是VIP,true表示是VIP，false表示不是VIP。
     * @param username 用户名
     * @param name     姓名
     * @return 加密后的token
     */
    public String getToken(final boolean isVip, final String username,
                           final String name) {
        String token = null;
        try {
//            Date expiresAt = new Date(System.currentTimeMillis() + 24L * 60L * 3600L * 1000L);
            Calendar calendar = Calendar.getInstance();
            // 设置三小时后失效
            calendar.add(Calendar.SECOND, 5);
            Date expiresAt = calendar.getTime();
            // 获取自定义密钥
            getSecret();
            token = JWT.create()
                    .withIssuer("xunmi")
                    .withAudience("people")
                    .withIssuedAt(new Date())
                    .withJWTId("04100")
                    .withSubject("JWT初体验")
                    .withClaim("isVip", isVip)
                    .withClaim("username", username)
                    .withClaim("name", name)
                    .withExpiresAt(expiresAt)
                    // 使用了HMAC256加密算法, secret 是用来加密数字签名的密钥。
                    .sign(Algorithm.HMAC256(secret));
        } catch (Exception exception) {
            //Invalid Signing configuration / Couldn't convert Claims.
        }
        return token;
    }

    /**
     * 随机生成密钥的方法
     *
     * @return
     */
    private void getSecret() {
        Random random = new Random();
        int num = random.nextInt(100 * 10000);
        secret = "xunmi" + String.valueOf(num >> random.nextInt(1));
    }

    public static void main(String[] args) {
    }
}
