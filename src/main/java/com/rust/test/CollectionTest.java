/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.test;

import java.util.Arrays;
import java.util.List;


/**
 * @author futanghang004
 * @version $Id: CollectionTest, v 0.1 2018/1/17  futanghang004 Exp $
 */
public class CollectionTest {
    public static void main(String[] args) {
        String[] s = {"1","2","3"};
        List<String> stringList = Arrays.asList(s);
        String[] strings = {"1", "2"};
        System.out.println(strings.length);
    }
}
