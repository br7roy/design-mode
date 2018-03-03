/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.factory;

/**
 *
 * @author FUTANGHANG004
 * @version $Id: Circle, v 0.1 2018/3/2  FUTANGHANG004 Exp $
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + "draw");
    }
}
