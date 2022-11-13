package com.store.Store.clientserver.delivery;

import lombok.Getter;
import lombok.Setter;

@Getter @Setter
public class Delivery {
    private boolean deliveryStatus;
    private DeliveryStrategy strategy;

    public Delivery(DeliveryStrategy strategy) {
        this.deliveryStatus = false;
        this.strategy = strategy;
    }

    public Delivery(DeliveryStrategy strategy, boolean deliveryStatus) {
        this.deliveryStatus = deliveryStatus;
        this.strategy = strategy;
    }
}
