package com.rust.runoob.responsibility.enchance;

/**
 * FileName: OrderChainDemo
 * Author:   Rust
 * Date:     2018/4/20
 * Description:
 * History:
 */
public class OrderChainDemo {
    public static void main(String[] args) {
        Order order = new Order();
        order.setOrderNo("098098");
        order.setOrderState(3);
        OrderRequest orderRequest = new OrderRequest();
        orderRequest.setOrder(order);

        AbsOrderResponsibilityChain initOrderChainOrder = new InitOrderChain();
        AbsOrderResponsibilityChain pcsOrderChain = new PcsOrderChain();
        AbsOrderResponsibilityChain doneOrderChain = new DoneOrderChain();
        initOrderChainOrder.setNextAppChain(pcsOrderChain);
        pcsOrderChain.setNextAppChain(doneOrderChain);









    }
}
