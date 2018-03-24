package com.rust.runoob.responsibility;

/**
 * FileName: AbsLogger
 * Author:   Rust
 * Date:     2018/4/4
 * Description:抽象记录器
 * History:
 */
public abstract class AbsLogger {
    public static int INFO = 1;
    public static int DEBUG = 2;
    public static int ERROR = 3;

    protected int level;

    // next element in responsibility
    protected AbsLogger nextLogger;

    public void setNextLogger(AbsLogger nextLogger) {
        this.nextLogger = nextLogger;
    }

    public void logMessage(int level, String message) {
        if (this.level <= level) {
            write(message);
        }
        if (nextLogger != null) {
            nextLogger.logMessage(level, message);
        }


    }

    protected abstract void write(String message);



}
