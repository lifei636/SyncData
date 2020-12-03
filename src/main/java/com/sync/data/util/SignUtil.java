package com.sync.data.util;

import org.springframework.util.DigestUtils;
import sun.security.provider.MD5;

/**
 * 签名算法
 */
public class SignUtil {

    /**
     * 获取签名字符串
     * @param appId 授权id
     * @param bodyJson 参数
     * @return
     */
    public static String getSign(String appId,String bodyJson){
        long now = System.currentTimeMillis();
        String params =  "mysecret"+appId+bodyJson+"md5"+now+"mysecret";
        String sign = DigestUtils.md5DigestAsHex(params.getBytes());
        return sign.toUpperCase();
    }
}
