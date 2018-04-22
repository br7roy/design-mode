package com.rust.runoob.responsibility.enchance;

/**
 * FileName: PcsOrderChain
 * Author:   Rust
 * Date:     2018/4/20
 * Description:
 * History:
 */
public class PcsOrderChain extends AbsOrderResponsibilityChain {
    public PcsOrderChain() {
        this.state = OrderStateEnum.PCS.getState();
    }

    @Override
    OrderResponse executeOrder(OrderRequest orderRequest) {
        System.out.println("PcsOrderChain.executeOrder");
        return new OrderResponse(0, "PcsResponse");
    }

    @Override
    public AbsOrderResponsibilityChain getOrderPcsChain(Order order) {
        return null;
    }
}
