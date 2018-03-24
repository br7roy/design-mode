package com.rust.runoob.responsibility;

/**
 * FileName: ChainPatternDemo
 * Author:   Rust
 * Date:     2018/4/4
 * Description:
 * History:
 */
public class ChainPatternDemo {
    public static void main(String[] args) {
        AbsLogger cl = new ConsoleLogger(1);
        cl.write("consoleLogger demo");



    }
}
