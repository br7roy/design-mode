package com.rust.runoob.absfactory;

/**
 * FileName: Shape
 * Author:   Rust
 * Date:     2018/3/20
 * Description:
 * History:
 */
public interface Shape {
	void draw();

	enum ShapeSort {
		CIRCLE("CIRCLE") {
			@Override
			protected Shape choseShape(String shape) {
				return new Circle();
			}
		},
		RECTANGLE("RECTANGLE") {
			@Override
			protected Shape choseShape(String shape) {
				return new Rectangle();
			}
		},
		SQUARE("SQUARE") {
			@Override
			protected Shape choseShape(String shape) {
				return new Square();
			}
		},;

		private String name;

		ShapeSort(String name) {
			this.name = name;
		}

		protected abstract Shape choseShape(String shape);

	}


}
