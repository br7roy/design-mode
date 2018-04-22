package com.rust.runoob.responsibility;

/**
 * FileName: DebugLogger
 * Author:   Rust
 * Date:     2018/4/4
 * Description:
 * History:
 */
public class DebugLogger extends AbsLogger {
    public DebugLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("DebugLogger.write::Logger:" + message);
    }
}
