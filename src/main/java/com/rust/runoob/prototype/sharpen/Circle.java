/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.prototype.sharpen;

/**
 *
 * @author futanghang004
 * @version $Id: Circle, v 0.1 2018/1/17  futanghang004 Exp $
 */
public class Circle extends Sharp {
    public Circle(){
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
