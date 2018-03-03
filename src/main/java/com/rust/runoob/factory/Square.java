package com.rust.runoob.factory;

/**
 * FileName:    Square
 * Author:      Rust
 * Date:        2018/3/2
 * Description:
 */
public class Square implements Shape {
    @Override
    public void draw() {
        System.out.println(this.getClass().getSimpleName() + "draw");
    }
}
