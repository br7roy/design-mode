package com.rust.runoob.responsibility.enchance;

/**
 * FileName: OrderStateEnum
 * Author:   Rust
 * Date:     2018/4/20
 * Description:
 * History:
 */
public interface OrderMgr {
    AbsOrderResponsibilityChain getOrderPcsChain(Order order);

    enum OrderStateEnum {

        INIT(0) {
            @Override
            protected AbsOrderResponsibilityChain getOrderChain(Order order) {
                return new InitOrderChain();
            }
        },
        PCS(1) {
            @Override
            protected AbsOrderResponsibilityChain getOrderChain(Order order) {
                return new PcsOrderChain();
            }

        },
        DONE(2) {
            @Override
            protected AbsOrderResponsibilityChain getOrderChain(Order order) {
                return new DoneOrderChain();
            }
        },;

        private final int state;

        OrderStateEnum(int state) {
            this.state = state;
        }

        public int getState() {
            return state;
        }

        abstract AbsOrderResponsibilityChain getOrderChain(Order order);

    }
}