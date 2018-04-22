package com.rust.runoob.responsibility;

/**
 * FileName: InfoLogger
 * Author:   Rust
 * Date:     2018/4/4
 * Description:记录器实体类
 * History:
 */
public class InfoLogger extends AbsLogger {
    public InfoLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("InfoLogger.write::Logger:" + message);
    }
}
