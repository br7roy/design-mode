package com.rust.runoob.strategy;

/**
 * FileName: Context
 * Author:   Rust
 * Date:     2018/3/16
 * Description:
 * History:
 */
public class Context {
    private Strategy strategy;

    public Context(Strategy strategy) {
        this.strategy = strategy;
    }

    public Strategy getStrategy() {
        return strategy;
    }

    public int excuteStrategy(int num1, int num2) {
        return strategy.doOperation(num1, num2);
    }

}
