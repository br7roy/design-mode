/*
 * Package:  com.rust.combat.template
 * FileName: DemoSuperObj
 * Author:   Rust
 * Date:     2020/1/14 9:06
 * email:    br7roy@gmail.com
 */
package com.rust.combat.template;

import java.io.Serializable;

/**
 * @author Rust
 */
public class DemoSuperObj<T> implements Serializable {


	private static final long serialVersionUID = 1L;

	private String name;

	private T data;

	public String getName() {
		return name;
	}

	public void setName(String name) {
		this.name = name;
	}

	public T getData() {
		return data;
	}

	public void setData(T data) {
		this.data = data;
	}
}
