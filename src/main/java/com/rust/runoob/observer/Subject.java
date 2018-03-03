/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.observer;

import java.util.ArrayList;
import java.util.List;

/**
 *
 * @author FUTANGHANG004
 * @version $Id: Subject, v 0.1 2018/2/22  FUTANGHANG004 Exp $
 */
public class Subject {

    private List<Observer> observers = new ArrayList<>();
    private int state;

    public int getState() {
        return state;
    }

    public void setState(int state) {
        this.state = state;
        notifyAllObservers();
    }

    private void notifyAllObservers() {
        for (Observer observer : observers) {
            observer.update();
        }
    }

    void attach(Observer observer) {
        this.observers.add(observer);
    }
}
