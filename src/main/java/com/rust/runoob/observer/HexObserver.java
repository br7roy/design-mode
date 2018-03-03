package com.rust.runoob.observer;

/**
 * FileName:    HexObserver
 * Author:      Rust
 * Date:        2018/2/22
 * Description:
 */
public class HexObserver extends Observer {
    public HexObserver(Subject subject) {
        super(subject);
        this.subject = subject;
        this.subject.attach(this);
    }

    @Override
    public void update() {
        System.out.println("Hex String: "
                + Integer.toHexString(subject.getState()).toUpperCase());
    }
}
