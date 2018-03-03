/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.observer.exercise;

import java.util.ArrayList;
import java.util.List;
import java.util.concurrent.atomic.AtomicInteger;

/**
 *
 * @author FUTANGHANG004
 * @version $Id: Teacher, v 0.1 2018/2/22  FUTANGHANG004 Exp $
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
