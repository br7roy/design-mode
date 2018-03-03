package com.rust.runoob.observer.exercise;

/**
 * FileName:    HighObserver
 * Author:      Rust
 * Date:        2018/2/22
 * Description:
 */
public class HighObserver extends WorkObserver {
    @Override
    public void doHomeWork(Teacher teacher) {
        System.out.println("HighObserver do home woke 10 minutes" + "teacher:" + teacher);
    }
}
