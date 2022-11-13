package com.store.Store.clientserver;

import com.store.Store.clientserver.delivery.Delivery;
import com.store.Store.clientserver.payment.Payment;
import com.store.Store.store.Item;

public interface ClientOrder {
    public void addItem(Item item);
    public void removeItem(Item item);
    public void setPayment(Payment payment);
    public void setDelivery(Delivery delivery);
    public int calculateTotalPrice();
}
