package com.rust.runoob.responsibility.enchance;

/**
 * FileName: AbsOrderResponsibilityChain
 * Author:   Rust
 * Date:     2018/4/20
 * Description: 订单处理责任链
 * History:
 */
public abstract class AbsOrderResponsibilityChain implements ResponsibilityChain, OrderMgr {


    protected int state;

    private AbsOrderResponsibilityChain nextAppChain;

    public void setNextAppChain(AbsOrderResponsibilityChain nextAppChain) {
        this.nextAppChain = nextAppChain;
    }

    public OrderResponse handle(OrderRequest orderRequest) {
        if (orderRequest.getOrder().getOrderState() == this.state) {
            return executeOrder(orderRequest);
        } else {
            return nextAppChain.handle(orderRequest);
        }

    }

    abstract OrderResponse executeOrder(OrderRequest orderRequest);

}
