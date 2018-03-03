package com.rust.runoob.prototype;

import com.rust.runoob.prototype.sharpen.Sharp;

/**
 * FileName:    PrototypePatternDemo
 * Author:      Rust
 * Date:        2018/1/17
 * Description:
 */
public class PrototypePatternDemo {
    public static void main(String[] args) {

        SharpCache.loadCache();

        Sharp s1 = SharpCache.getSharp("1");
        Sharp s2 = SharpCache.getSharp("2");
        Sharp s3 = SharpCache.getSharp("3");
        System.out.println(s1.getType());
        System.out.println(s2.getType());
        System.out.println(s3.getType());
    }


}
