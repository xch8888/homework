package com.xch.boots.util;

import org.apache.commons.mail.HtmlEmail;
import org.testng.annotations.Test;

import java.util.Random;


/**
 * @package: com.tmh.winterproject.config
 * @ClassName: mytest
 * @author: T.
 * @date: 2022/1/21 14:12
 */
public class mytest {

    @Test

    public void verifyCode(){
        String str = "";
        char[] ch = {'0', '1', '2', '3', '4', '5', '6', '7', '8', '9', 'A', 'B', 'C', 'D', 'E', 'F', 'G', 'H', 'I', 'J', 'K',
                'L', 'M', 'N', 'O', 'P', 'Q', 'R', 'S', 'T', 'U', 'V', 'W', 'X', 'Y', 'Z', 'a', 'b', 'c', 'd', 'e', 'f', 'g', 'h', 'i', 'j', 'k', 'l', 'm', 'n',
                'o', 'p', 'q', 'r', 's', 't', 'u', 'v', 'w', 'x', 'y', 'z'};
        Random random = new Random();
        for (int i = 0; i <6; i++){
            char num = ch[random.nextInt(ch.length)];
            str += num;
        }
        System.out.println(str);
    }
}
