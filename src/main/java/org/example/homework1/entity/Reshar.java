package org.example.homework1.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.ArrayList;
import java.util.List;
import java.util.stream.Collectors;

@Component
@ToString
public class Reshar {
    private List<Goods> bicycle = new ArrayList<>();
    @ToString.Exclude
    private Storage storage;

    @Autowired
    public Reshar(Storage storage) {
        this.storage = storage;
    }

    public void buyBicycle() {
        this.bicycle = storage.getGoods().get("Bicycle").stream()
                .filter(e -> !e.isBroken()).collect(Collectors.toList());
    }
}
