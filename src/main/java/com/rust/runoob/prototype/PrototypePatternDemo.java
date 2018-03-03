/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.prototype;

import runoob.prototype.sharpen.Sharp;

/**
 * @author futanghang004
 * @version $Id: PrototypePatternDemo, v 0.1 2018/1/17  futanghang004 Exp $
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
