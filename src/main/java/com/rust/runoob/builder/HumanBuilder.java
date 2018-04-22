package com.rust.runoob.builder;

/**
 * FileName: HumanBuilder
 * Author:   Rust
 * Date:     2018/4/19
 * Description:
 * History:
 */
public class HumanBuilder {
    private static HumanBuilder ourInstance = new HumanBuilder();

    public static HumanBuilder getInstance() {
        return ourInstance;
    }

    private Human human;

    private HumanBuilder() {
        human = new Human();
    }

    public HumanBuilder addFoot(){
        this.human.setFoot("foot");
        return this;
    }
    public HumanBuilder addEye(){
        this.human.setEye("eye");
        return this;
    }
    public HumanBuilder addEar(){
        this.human.setEar("ear");
        return this;
    }
    public HumanBuilder addHair(){
        this.human.setHair("hair");
        return this;
    }
    public HumanBuilder addMouse(){
        this.human.setMouse("mouse");
        return this;
    }
    public HumanBuilder addLeg(){
        this.human.setLeg("leg");
        return this;
    }

    public Human getHuman() {
        return human;
    }
}
