/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.observer;

/**
 * @author FUTANGHANG004
 * @version $Id: OctalObserver, v 0.1 2018/2/22  FUTANGHANG004 Exp $
 */
public class OctalObserver extends Observer {
    public OctalObserver(Subject subject) {
        super(subject);
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Octal String: "
                + Integer.toOctalString(subject.getState()));
    }
}
