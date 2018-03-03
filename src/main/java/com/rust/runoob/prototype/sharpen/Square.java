package com.rust.runoob.prototype.sharpen;

/**
 * FileName:    Square
 * Author:      Rust
 * Date:        2018/1/17
 * Description:
 */
public class Square extends Sharp {
    public Square() {
        type = "Square";
    }

    @Override
    public void draw() {
        System.out.println("Inside Square::draw() method.");
    }
}
