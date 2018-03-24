package com.rust.runoob.responsibility;

/**
 * FileName: FileLogger
 * Author:   Rust
 * Date:     2018/4/4
 * Description:
 * History:
 */
public class FileLogger extends AbsLogger {
    public FileLogger(int level) {
        this.level = level;
    }

    @Override
    protected void write(String message) {
        System.out.println("FileLogger.write" + message);
    }
}
