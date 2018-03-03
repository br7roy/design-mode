package com.rust.runoob.factory;

/**
 * FileName:    Circle
 * Author:      Rust
 * Date:        2018/3/2
 * Description:
 */
public class Circle implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + "draw");
    }
}
