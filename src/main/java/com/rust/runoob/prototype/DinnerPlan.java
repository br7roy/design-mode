package com.rust.runoob.prototype;

import java.util.Hashtable;
import java.util.Map;

/**
 * FileName:    DinnerPlan
 * Author:      Rust
 * Date:        2018/1/17
 * Description:
 */
public class DinnerPlan {
    private Map<String, ? super Fruit> fruit = new Hashtable<>();


    public void addFruit() {
        Apple apple = new Apple();
        PineApple pineApple = new PineApple();
        fruit.put("1", pineApple);


    }


}
