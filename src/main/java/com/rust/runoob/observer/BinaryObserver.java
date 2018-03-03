/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.observer;

/**
 * @author FUTANGHANG004
 * @version $Id: BinaryObserver, v 0.1 2018/2/22  FUTANGHANG004 Exp $
 */
public class BinaryObserver extends Observer {

    public BinaryObserver(Subject subject) {
        super(subject);
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Binary String: "
                + Integer.toBinaryString(subject.getState()));


    }
}
