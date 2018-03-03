package com.rust.runoob.prototype;

import com.rust.runoob.prototype.sharpen.Circle;
import com.rust.runoob.prototype.sharpen.Rectangle;
import com.rust.runoob.prototype.sharpen.Sharp;
import com.rust.runoob.prototype.sharpen.Square;

import java.util.Hashtable;

/**
 * FileName:    SharpCache
 * Author:      Rust
 * Date:        2018/1/17
 * Description:
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
