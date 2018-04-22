package com.rust.runoob.responsibility.enchance;

/**
 * FileName: Order
 * Author:   Rust
 * Date:     2018/4/20
 * Description:
 * History:
 */
public class Order {
    private String orderNo;
    private int orderState;

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    public int getOrderState() {
        return orderState;
    }

    public void setOrderState(int orderState) {
        this.orderState = orderState;
    }

    @Override
    public String toString() {
        return "Order{" +
                "orderNo='" + orderNo + '\'' +
                ", orderState=" + orderState +
                '}';
    }
}
