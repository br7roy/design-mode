package com.rust.runoob.observer.exercise;

import java.text.MessageFormat;
import java.util.logging.Logger;

/**
 * FileName:    Client
 * Author:      Rust
 * Date:        2018/2/22
 * Description: MessageFormat.format方法需要传入一个数组
 */
public class Client {
    private static Logger logger = Logger.getLogger("Client");

    public static void main(String[] args) {
        Teacher teacher = new Teacher();
        teacher.addObserver(new HighObserver());
        teacher.addObserver(new LowObserver());

        Client c = new Client();
        String format = "teacher distribute work times:{0}";
        MessageFormat messageFormat = new MessageFormat(format);
        //MessageFormat format = new MessageFormat("teacher distribute work times:{0}");
        for (int i = 0; i < 50; i++) {
            System.out.println(messageFormat.format(new Object[]{teacher.setDistributeCount()}));
            //c.debug(format, teacher.setDistributeCount());
            //logger.info(format.format(new Date()));
        }
    }

    public void debug(String format, Object objects) {
        MessageFormat messageFormat = new MessageFormat(format);
        System.out.println(messageFormat.format(objects));

    }
}
