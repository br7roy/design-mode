package com.rust.runoob.prototype.sharpen;

/**
 * FileName:    Circle
 * Author:      Rust
 * Date:        2018/1/17
 * Description:
 */
public class Circle extends Sharp {
    public Circle() {
        type = "Circle";
    }

    @Override
    public void draw() {
        System.out.println("Inside Circle::draw() method.");
    }
}
