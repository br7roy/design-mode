package com.rust.runoob.observer;

import java.util.ArrayList;
import java.util.List;

/**
 * FileName:    Subject
 * Author:      Rust
 * Date:        2018/2/22
 * Description:
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
