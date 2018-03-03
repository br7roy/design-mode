package com.rust.test;

import java.util.Arrays;
import java.util.List;


/**
 * FileName:    CollectionTest
 * Author:      Rust
 * Date:        2018/1/17
 * Description:
 */
public class CollectionTest {
    public static void main(String[] args) {
        String[] s = {"1", "2", "3"};
        List<String> stringList = Arrays.asList(s);
        String[] strings = {"1", "2"};
        System.out.println(strings.length);
    }
}
