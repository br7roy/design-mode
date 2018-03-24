package com.rust.runoob.absfactory;

/**
 * FileName: Color
 * Author:   Rust
 * Date:     2018/3/20
 * Description:
 * History:
 */
public interface Color {
	void fill();

	enum ColorSort {
		RED("RED") {
			@Override
			public Color choseColor(String color) {
				return new Red();
			}
		},
		GREEN("GREEN") {
			@Override
			public Color choseColor(String color) {
				return new Green();
			}
		},
		BLUE("BLUE") {
			@Override
			public Color choseColor(String color) {
				return new Blue();
			}
		},;

		private String name;

		ColorSort(String name) {
			this.name = name;
		}

		public abstract Color choseColor(String color);
	}
}
