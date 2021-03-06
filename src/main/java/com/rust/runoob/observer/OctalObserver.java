package com.rust.runoob.observer;

/**
 * FileName:    OctalObserver
 * Author:      Rust
 * Date:        2018/2/22
 * Description:
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
