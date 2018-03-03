/**
 * 壹钱包
 * Copyright (c) 2013-2018 壹钱包版权所有.
 */
package com.rust.runoob.factory;

/**
 *
 * @author FUTANGHANG004
 * @version $Id: ObjFactory, v 0.1 2018/3/2  FUTANGHANG004 Exp $
 */
public class ObjFactory {

    public ObjFactory() {
    }

    public static <T> T getObj(Class<? extends Shape> clazz) {

        if (clazz==null) throw new IllegalArgumentException("clazz can not be null");

        if (clazz.isInterface()) throw new RuntimeException("class[" + clazz.getName() + "]Specified class is an interface");
        T o = null;
        try {
            o = (T) Class.forName(clazz.getName()).newInstance();
        } catch (InstantiationException | IllegalAccessException | ClassNotFoundException e) {
            e.printStackTrace();
        }
        return o;
    }

    public static void main(String[] args) {

        Square square = ObjFactory.getObj(Square.class);
        square.draw();



    }
}
