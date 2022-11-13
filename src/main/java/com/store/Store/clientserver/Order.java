package com.store.Store.clientserver;

import com.store.Store.clientserver.delivery.Delivery;
import com.store.Store.clientserver.delivery.DeliveryStrategy;
import com.store.Store.clientserver.payment.Payment;
import com.store.Store.clientserver.payment.PaymentStrategy;
import com.store.Store.store.Item;
import lombok.Getter;
import lombok.Setter;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.ArrayList;

@Getter @Setter
public class Order implements ClientOrder{
    private ArrayList<Item> items = new ArrayList<>();
    private int id;
    private int price = 0;
    private Payment payment;
    private Delivery delivery;

    public void addItem(Item item) {
        items.add(item);
        price += item.getPrice();
    }

    public void removeItem(Item item){
        for (Item one_item: items){
            if (one_item == item){
                items.remove(item);
                return;
            }
        }
    }

    public void setPayment(PaymentStrategy strategy){
        payment = new Payment(strategy);
        if (payment.isPaymentStatus()){
            delivery.setDeliveryStatus(true);
        }
    }

    public void setDelivery(DeliveryStrategy strategy){
        this.delivery = new Delivery(strategy);
        if (payment.isPaymentStatus()){
            delivery.setDeliveryStatus(true);
        }
    }

    public int calculateTotalPrice() {
        return getPrice();
    }
}
