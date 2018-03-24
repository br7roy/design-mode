package com.rust.runoob.absfactory;

import com.google.common.base.Preconditions;
import com.rust.runoob.absfactory.Shape.ShapeSort;

import static java.util.Locale.CHINA;

/**
 * FileName: ShapeFactory
 * Author:   Rust
 * Date:     2018/3/20
 * Description:
 * History:
 */
public class ShapeFactory extends AbstractFactory {

	@Override
	Shape getShape(String shape) {
		Preconditions.checkNotNull(shape, "shape can't be null");
		ShapeSort shapeSort = ShapeSort.valueOf(shape.toUpperCase(CHINA));
		return shapeSort.choseShape(shape);
	}


	@Override
	Color getColor(String color) {
		return null;
	}
}
