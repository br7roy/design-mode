package com.rust.runoob.absfactory;

import com.google.common.base.Preconditions;

/**
 * FileName: FactoryProducer
 * Author:   Rust
 * Date:     2018/3/20
 * Description:
 * History:
 */
public class FactoryProducer {

	public static AbstractFactory getFactory(String choice) {
		Preconditions.checkNotNull(choice, "choice can't be null");
		if(choice.equalsIgnoreCase("SHAPE")){
			return new ShapeFactory();
		} else if(choice.equalsIgnoreCase("COLOR")){
			return new ColorFactory();
		}
		return null;
	}


}
