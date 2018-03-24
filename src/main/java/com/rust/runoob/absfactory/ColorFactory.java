package com.rust.runoob.absfactory;

import com.google.common.base.Preconditions;
import com.rust.runoob.absfactory.Color.ColorSort;

import static java.util.Locale.CHINA;

/**
 * FileName: ColorFactory
 * Author:   Rust
 * Date:     2018/3/20
 * Description:
 * History:
 */
public class ColorFactory extends AbstractFactory {
	@Override
	Color getColor(String color) {
		Preconditions.checkNotNull(color, "color can't be null");
		ColorSort colorSort = ColorSort.valueOf(color.toUpperCase(CHINA));
		return colorSort.choseColor(color);
	}

	@Override
	Shape getShape(String shape) {
		return null;
	}
}
