package org.example.homework1.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@ToString
public class Petrovich {
    private List<Goods> vodka = new ArrayList<>();
    @ToString.Exclude
    private Storage storage;

    @Autowired
    public Petrovich(Storage storage) {
        this.storage = storage;
    }

    public void buyVodka() {
        this.vodka = storage.getGoods().get("Vodka").stream().filter(Goods::isBroken).collect(Collectors.toList());
    }
}
