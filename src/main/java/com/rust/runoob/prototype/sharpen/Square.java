/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.prototype.sharpen;

/**
 *
 * @author futanghang004
 * @version $Id: Square, v 0.1 2018/1/17  futanghang004 Exp $
 */
public class Square extends Sharp {
    public Square(){
        type = "Square";
    }
    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
