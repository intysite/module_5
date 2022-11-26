package org.example.homework1.entity;

import lombok.Value;

@Value
public class Worker {
    private String name;

    public void brokenGoods(Goods goods) {
        goods.setBroken(true);
    }
}
