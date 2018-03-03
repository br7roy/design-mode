/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.observer.exercise;

/**
 *
 * @author FUTANGHANG004
 * @version $Id: HighObserver, v 0.1 2018/2/22  FUTANGHANG004 Exp $
 */
public class HighObserver extends WorkObserver {
    @Override
    public void doHomeWork(Teacher teacher) {
        System.out.println("HighObserver do home woke 10 minutes" + "teacher:" + teacher);
    }
}
