package com.rust.runoob.responsibility;

/**
 * FileName: ConsoleLogger
 * Author:   Rust
 * Date:     2018/4/4
 * Description:记录器实体类
 * History:
 */
public class ConsoleLogger extends AbsLogger {
    public ConsoleLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ConsoleLogger.write" + message);

    }
}
