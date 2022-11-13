package com.store.Store.clientserver;

import com.store.Store.clientserver.delivery.Delivery;
import com.store.Store.clientserver.delivery.DeliveryStrategy;
import com.store.Store.clientserver.payment.Payment;
import com.store.Store.clientserver.payment.PaymentStrategy;
import com.store.Store.store.Item;

public interface ClientOrder {
    public void addItem(Item item);
    public void removeItem(Item item);
    public void setPayment(PaymentStrategy strategy);
    public void setDelivery(DeliveryStrategy strategy);
    public int calculateTotalPrice();
}
