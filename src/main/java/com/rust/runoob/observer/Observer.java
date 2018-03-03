package com.rust.runoob.observer;

import java.util.EventObject;

/**
 * FileName:    TestThread
 * Author:      Rust
 * Date:        2018/2/22
 * Description:
 */
public abstract class Observer extends EventObject {
    private static final long serialVersionUID = 8118271847047339797L;
    protected Subject subject;

    public abstract void update();

    /**
     * Constructs a prototypical Event.
     *
     * @param source The object on which the Event initially occurred.
     * @throws IllegalArgumentException if source is null.
     */
    public Observer(Object source) {
        super(source);
    }

}
