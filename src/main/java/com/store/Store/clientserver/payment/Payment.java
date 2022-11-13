package com.store.Store.clientserver.payment;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Payment {
    private boolean paymentStatus;
    private PaymentStrategy strategy;

    public Payment(PaymentStrategy strategy) {
        this.paymentStatus = false;
        this.strategy = strategy;
    }

    public Payment(PaymentStrategy strategy, boolean paymentStatus) {
        this.paymentStatus = paymentStatus;
        this.strategy = strategy;
    }
}
