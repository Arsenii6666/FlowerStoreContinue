package com.Flower_store.Lab_7.PayOrder;

import java.util.List;

public class DHLDeliveryStrategy implements Delivery{
    @Override
    public void deliver(List<Item> items) {
        return;
    }
    @Override
    public String toString() {
        return "DHLDelivery";
    }
}
