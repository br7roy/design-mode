package com.rust.runoob.absfactory;

/**
 * FileName: AbstractFactory
 * Author:   Rust
 * Date:     2018/3/20
 * Description:
 * History:
 */
public abstract class AbstractFactory {
	abstract Color getColor(String color);

	abstract Shape getShape(String shape);
}
