/*
 * Package:  com.rust.combat.template
 * FileName: AbsHandler
 * Author:   Rust
 * Date:     2020/1/14 9:03
 * email:    br7roy@gmail.com
 */
package com.rust.combat.template;

import java.io.Serializable;

/**
 * @author Rust
 */
public abstract class AbsHandler<V extends DemoSuperObj<?extends Serializable>> implements IHandler<V> {

	@Override
	public void handle(V v) {

	}


	protected abstract void doService(V v);
}
