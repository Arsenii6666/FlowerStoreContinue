package com.Flower_store.Lab_7.PayOrder;

import lombok.Getter;

@Getter
public abstract class Item {
    String description;
    abstract public double price();
}
