package com.rust.runoob.responsibility;

/**
 * FileName: ErrorLogger
 * Author:   Rust
 * Date:     2018/4/4
 * Description:
 * History:
 */
public class ErrorLogger extends AbsLogger {
    public ErrorLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("ErrorLogger.write" + message);
    }
}
