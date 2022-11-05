package com.Flower_store.Lab_7;


import com.Flower_store.Lab_7.PayOrder.DHLDeliveryStrategy;
import com.Flower_store.Lab_7.PayOrder.Item;
import com.Flower_store.Lab_7.PayOrder.Order;
import com.Flower_store.Lab_7.PayOrder.PayPalPaymentStrategy;
import com.Flower_store.Lab_7.Store.*;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import java.util.Random;

@RestController
public class StoreControler {
    private static final Random RANDOM_GENERATOR = new Random();
    private static final int MAX_QUANTITY = 1000;
    private static final int MAX_PRICE = 100;
    @GetMapping("/")
    public String index() {
        Order ord = new Order();
        int price = RANDOM_GENERATOR.nextInt(MAX_PRICE);
        int quantity = RANDOM_GENERATOR.nextInt(MAX_QUANTITY);
        Flower flower = new Rose();
        flower.setPrice(price);
        FlowerPack flowerPack = new FlowerPack(flower, quantity);
        FlowerBucket flowerBucket=new FlowerBucket();
        flowerBucket.add(flowerPack);
        ord.addItem(flowerBucket);
        ord.setDelivery(new DHLDeliveryStrategy());
        ord.setPayment(new PayPalPaymentStrategy());
        ord.ProcessOrder();
        return ord.toString();
    }
}
