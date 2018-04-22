package com.rust.runoob.builder;

/**
 * FileName: Human
 * Author:   Rust
 * Date:     2018/4/19
 * Description:
 * History:
 */
public class Human {
    private String eye;
    private String hand;
    private String head;
    private String mouse;
    private String nouse;
    private String foot;
    private String leg;
    private String ear;
    private String hair;

    public String getEye() {
        return eye;
    }

    public void setEye(String eye) {
        this.eye = eye;
    }

    public String getHand() {
        return hand;
    }

    public void setHand(String hand) {
        this.hand = hand;
    }

    public String getHead() {
        return head;
    }

    public void setHead(String head) {
        this.head = head;
    }

    public String getMouse() {
        return mouse;
    }

    public void setMouse(String mouse) {
        this.mouse = mouse;
    }

    public String getNouse() {
        return nouse;
    }

    public void setNouse(String nouse) {
        this.nouse = nouse;
    }

    public String getFoot() {
        return foot;
    }

    public void setFoot(String foot) {
        this.foot = foot;
    }

    public String getLeg() {
        return leg;
    }

    public void setLeg(String leg) {
        this.leg = leg;
    }

    public String getEar() {
        return ear;
    }

    public void setEar(String ear) {
        this.ear = ear;
    }

    public String getHair() {
        return hair;
    }

    public void setHair(String hair) {
        this.hair = hair;
    }

    @Override
    public String toString() {
        return "Human{" +
                "eye='" + eye + '\'' +
                ", hand='" + hand + '\'' +
                ", head='" + head + '\'' +
                ", mouse='" + mouse + '\'' +
                ", nouse='" + nouse + '\'' +
                ", foot='" + foot + '\'' +
                ", leg='" + leg + '\'' +
                ", ear='" + ear + '\'' +
                ", hair='" + hair + '\'' +
                '}';
    }
}
