package org.example.homework1.entity;

import org.springframework.stereotype.Component;

import java.util.List;
import java.util.stream.Collectors;
import java.util.stream.Stream;

@Component
public class Absolute{
    public List<Goods> deliverGoods(int value) {
        return Stream.generate(Vodka::new).limit(value).collect(Collectors.toList());
    }
}
