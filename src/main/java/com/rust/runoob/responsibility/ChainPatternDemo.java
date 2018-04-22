package com.rust.runoob.responsibility;

/**
 * FileName: ChainPatternDemo
 * Author:   Rust
 * Date:     2018/4/4
 * Description:
 * History:
 */
public class ChainPatternDemo {

    private static AbsLogger getChainOfLoggers(){

        AbsLogger debugLogger = new DebugLogger(AbsLogger.DEBUG);
        AbsLogger infoLogger = new InfoLogger(AbsLogger.INFO);
        AbsLogger errorLogger = new ErrorLogger(AbsLogger.ERROR);

        debugLogger.setNextLogger(infoLogger);
        infoLogger.setNextLogger(errorLogger);

        return errorLogger;
    }



    public static void main(String[] args) {
        AbsLogger loggerChain = getChainOfLoggers();

        loggerChain.logMessage(AbsLogger.INFO,
                "This is an information.");

        loggerChain.logMessage(AbsLogger.DEBUG,
                "This is an debug level information.");

        loggerChain.logMessage(AbsLogger.ERROR,
                "This is an error information.");
    }
}
