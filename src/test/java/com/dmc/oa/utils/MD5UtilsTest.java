package com.dmc.oa.utils;

import org.junit.Test;

public class MD5UtilsTest {
    @Test
    public void md5Digest(){
        //String result = MD5Utils.md5Digest("test^%^%$^&T*&");
        //String result2 = MD5Utils.md5Digest("test");
        int x=188;
        for(int i=0;i<10;i++){
            String result3 = MD5Utils.md5Digest("pass",x++);
            //System.out.println(result);
            //System.out.println(result2);
            System.out.println(result3);
        }


    }
}
