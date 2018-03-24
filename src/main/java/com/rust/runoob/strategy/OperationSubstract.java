package com.rust.runoob.strategy;

/**
 * FileName: OperationSubstract
 * Author:   Rust
 * Date:     2018/3/16
 * Description:
 * History:
 */
public class OperationSubstract implements Strategy {
    @Override
    public int doOperation(int num1, int num2) {
        return num1 - num2;
    }
}
