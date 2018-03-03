package com.rust.runoob.observer;

/**
 * FileName:    BinaryObserver
 * Author:      Rust
 * Date:        2018/2/22
 * Description:
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
