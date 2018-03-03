/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.observer;

/**
 *
 * @author FUTANGHANG004
 * @version $Id: ObserverPatternDemo, v 0.1 2018/2/22  FUTANGHANG004 Exp $
 */
public class ObserverPatternDemo {
    public static void main(String[] args) {
        Subject subject = new Subject();
        new BinaryObserver(subject);
        new HexaObserver(subject);
        new OctalObserver(subject);
        System.out.println("first state change 15");
        subject.setState(15);
        System.out.println("second state change 10");
        subject.setState(10);

    }
}
