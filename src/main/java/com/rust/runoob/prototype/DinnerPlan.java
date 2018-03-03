/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.prototype;

import java.util.Hashtable;
import java.util.Map;

/**
 * @author futanghang004
 * @version $Id: DinnerPlan, v 0.1 2018/1/17  futanghang004 Exp $
 */
public class DinnerPlan {
    private Map<String, ? super Fruit> fruit = new Hashtable<>();


    public  void addFruit() {
        Apple apple = new Apple();
        PineApple pineApple = new PineApple();
        fruit.put("1",pineApple);


    }






}
