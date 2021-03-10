package com.dmc.oa.utils;

import org.apache.commons.codec.cli.Digest;
import org.apache.commons.codec.digest.DigestUtils;

public class MD5Utils {
    public static String md5Digest(String source){
        return DigestUtils.md2Hex(source);
    }
    public static String md5Digest(String source ,Integer salt){//sal 盐值
        char[] ca = source.toCharArray();
        for(int i = 0;i<ca.length; i++){
            ca[i]=(char)(ca[i] + salt);
        }
        String target = new String(ca);
        return MD5Utils.md5Digest(target);
    }
}
