package com.yc.bookstore;

import com.yc.bookstore.util.MD5;

import java.io.UnsupportedEncodingException;
import java.security.NoSuchAlgorithmException;

public class test {

    public static void main(String[] args) throws UnsupportedEncodingException, NoSuchAlgorithmException {
        System.out.println(MD5.EncoderByMd5("123456"));
    }


}
