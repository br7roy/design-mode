package com.rust.runoob.factory;

/**
 * FileName:    ObjFactory
 * Author:      Rust
 * Date:        2018/3/2
 * Description:
 */
public class ObjFactory {

    public ObjFactory() {
    }

    public static <T> T getObj(Class<? extends Shape> clazz) {

        if (clazz == null) throw new IllegalArgumentException("clazz can not be null");

        if (clazz.isInterface())
            throw new RuntimeException("class[" + clazz.getName() + "]Specified class is an interface");
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
