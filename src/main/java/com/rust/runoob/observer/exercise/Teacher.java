package com.rust.runoob.observer.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 * FileName:    Teacher
 * Author:      Rust
 * Date:        2018/2/22
 * Description:
 */
public class Teacher {
    private List<WorkObserver> observers = new ArrayList<>();
    private AtomicInteger distributeCount = new AtomicInteger(0);

    void addObserver(WorkObserver observer) {
        observers.add(observer);
    }

    public int setDistributeCount() {
        for (WorkObserver observer : observers) {
            observer.doHomeWork(this);
        }
        return distributeCount.incrementAndGet();
    }

}
