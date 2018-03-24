package com.rust.runoob.strategy;

/**
 * FileName: OperationMultiply
 * Author:   Rust
 * Date:     2018/3/16
 * Description:
 * History:
 */
public class OperationMultiply implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 * num2;
    }
}
