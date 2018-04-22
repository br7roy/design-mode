package com.rust.runoob.responsibility.enchance;

/**
 * FileName: DoneOrderChain
 * Author:   Rust
 * Date:     2018/4/20
 * Description:
 * History:
 */
public class DoneOrderChain extends AbsOrderResponsibilityChain {
    public DoneOrderChain() {
        this.state = OrderStateEnum.DONE.getState();
    }

    @Override
    OrderResponse executeOrder(OrderRequest orderRequest) {
        System.out.println("DoneOrderChain.executeOrder");
        return new OrderResponse(0, "doneResponse");
    }

    @Override
    public AbsOrderResponsibilityChain getOrderPcsChain(Order order) {
        for (OrderStateEnum orderStateEnum : OrderStateEnum.values()) {
            if (orderStateEnum.getState() == order.getOrderState()) {
                return orderStateEnum.getOrderChain(order);
            }
        }
        System.out.println("no pcs chain");
        return null;
    }
}
