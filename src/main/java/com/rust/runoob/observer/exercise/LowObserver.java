package com.rust.runoob.observer.exercise;

/**
 * FileName:    LowObserver
 * Author:      Rust
 * Date:        2018/2/22
 * Description:
 */
public class LowObserver extends WorkObserver {
    @Override
    public void doHomeWork(Teacher teacher) {
        System.out.println("LowObserver do home worker in 30 minutes" + "teacher:" + teacher);
    }
}
