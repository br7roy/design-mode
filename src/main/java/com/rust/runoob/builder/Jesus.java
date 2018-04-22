package com.rust.runoob.builder;

/**
 * FileName: Jesus
 * Author:   Rust
 * Date:     2018/4/19
 * Description:
 * History:
 */
public class Jesus {
    public static void main(String[] args) {
        HumanBuilder humanBuilder = HumanBuilder.getInstance().addFoot().addEar().addEye().addMouse().addHair().addLeg();
        System.out.println(humanBuilder.getHuman());

    }
}
