package org.example.homework1.entity;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Aist {
    public List<Goods> deliverGoods(int value) {
        return Stream.generate(Bicycle::new).limit(value).collect(Collectors.toList());
    }
}
