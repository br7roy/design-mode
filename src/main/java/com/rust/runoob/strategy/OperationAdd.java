package com.rust.runoob.strategy;

/**
 * FileName: OperationAdd
 * Author:   Rust
 * Date:     2018/3/16
 * Description:
 * History:
 */
public class OperationAdd implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
		//
        return num1 + num2;
    }
}
