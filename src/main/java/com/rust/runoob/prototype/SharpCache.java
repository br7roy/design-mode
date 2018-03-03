/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.prototype;

import java.util.Hashtable;

import runoob.prototype.sharpen.Circle;
import runoob.prototype.sharpen.Rectangle;
import runoob.prototype.sharpen.Sharp;
import runoob.prototype.sharpen.Square;

/**
 * @author futanghang004
 * @version $Id: SharpCache, v 0.1 2018/1/17  futanghang004 Exp $
 */
public class SharpCache {

    private static Hashtable<String, ? super Sharp> sharpTable = new Hashtable<String, Sharp>(16);

    public static Sharp getSharp(String sharpId) {
        return (Sharp) sharpTable.get(sharpId);
    }

    public static void loadCache() {

        Circle circle = new Circle();
        circle.setId("1");
        sharpTable.put(circle.getId(), circle);
        Rectangle rectangle = new Rectangle();
        rectangle.setId("2");
        sharpTable.put(rectangle.getId(), rectangle);
        Square square = new Square();
        square.setId("3");
        sharpTable.put(square.getId(), square);

    }
}
