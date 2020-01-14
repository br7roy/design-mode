/*
 * Package:  com.rust.combat.template
 * FileName: Invoker
 * Author:   Rust
 * Date:     2020/1/14 9:54
 * email:    br7roy@gmail.com
 */
package com.rust.combat.template;

import java.io.Serializable;

/**
 * @author Rust
 */
public class Invoker {
	public static void main(String[] args) {
		Invoker invoker = new Invoker();
		DemoSuperObj<DemoObj> obj = new DemoSuperObj<>();

		invoker.xxx().handle(obj);

	}

	public AbsHandler<DemoSuperObj<?extends Serializable>> xxx() {
		return null;
	}
}
