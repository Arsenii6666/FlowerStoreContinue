package com.Flower_store.Lab_7.PayOrder;

public class CreditCardPaymentStrategy implements Payment{
    @Override
    public void pay_order(double price) {
        return;
    }
    @Override
    public String toString() {
        return "CreditCard";
    }
}
