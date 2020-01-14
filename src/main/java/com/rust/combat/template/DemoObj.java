/*
 * Package:  com.rust.combat.template
 * FileName: DemoObj
 * Author:   Rust
 * Date:     2020/1/14 9:03
 * email:    br7roy@gmail.com
 */
package com.rust.combat.template;

import java.io.Serializable;

/**
 * @author Rust
 */
public class DemoObj implements Serializable {
	private static final long serialVersionUID = 1L;

	private int size;

	public int getSize() {
		return size;
	}

	public void setSize(int size) {
		this.size = size;
	}
}
