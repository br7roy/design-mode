package com.rust.runoob.responsibility.enchance;

/**
 * FileName: InitOrderChain
 * Author:   Rust
 * Date:     2018/4/20
 * Description:
 * History:
 */
public class InitOrderChain extends AbsOrderResponsibilityChain {
    public InitOrderChain() {
        this.state = OrderStateEnum.INIT.getState();
    }

    @Override
    OrderResponse executeOrder(OrderRequest orderRequest) {
        System.out.println("InitOrderChain.executeOrder");
        return new OrderResponse(0, "initResponse");
    }

    @Override
    public AbsOrderResponsibilityChain getOrderPcsChain(Order order) {
        return null;
    }
}
