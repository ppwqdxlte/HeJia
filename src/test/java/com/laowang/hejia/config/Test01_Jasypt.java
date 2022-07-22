package com.laowang.hejia.config;

import org.jasypt.encryption.StringEncryptor;
import org.junit.jupiter.api.Test;
import org.springframework.boot.test.context.SpringBootTest;
//import org.springframework.core.codec.StringDecoder;

import javax.annotation.Resource;

@SpringBootTest
public class Test01_Jasypt {

    @Resource
    private StringEncryptor stringEncryptor;

    /*
    @Resource
    private StringDecoder stringDecoder;    // 只写这句，没法儿解码
*/
    @Test
    void testJasyptEncrypt() {
        String suibian = stringEncryptor.encrypt("suibian");
        System.out.println(suibian);
    }

}
