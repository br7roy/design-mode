/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.observer;

import java.util.EventObject;

/**
 * @author FUTANGHANG004
 * @version $Id: Observer, v 0.1 2018/2/22  FUTANGHANG004 Exp $
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
