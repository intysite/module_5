package org.example.homework1.entity;

import lombok.ToString;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Qualifier;
import org.springframework.stereotype.Component;

import java.util.HashMap;
import java.util.List;
import java.util.Map;
import java.util.stream.IntStream;

@Component
@ToString
public class Storage {
    private Map<String, List<Goods>> goods = new HashMap<>();
    private Worker worker1;
    private Worker worker2;

    @Autowired
    public Storage(@Qualifier("misha") Worker worker1, @Qualifier("zelia") Worker worker2) {
        this.worker1 = worker1;
        this.worker2 = worker2;
    }

    public Map<String, List<Goods>> getGoods() {
        return goods;
    }

    public void acceptVodka(List<Goods> vodka) {
        IntStream.range(0, vodka.size()).
                filter(e -> (e + 1) % 2 == 0)
                .mapToObj(vodka::get)
                .forEach(e -> worker1.brokenGoods(e));
        goods.put("Vodka", vodka);
    }

    public void acceptBicycle(List<Goods> bicycle) {
        IntStream.range(0, bicycle.size()).
                filter(e -> (e + 1) % 2 == 0)
                .mapToObj(bicycle::get)
                .forEach(e -> worker1.brokenGoods(e));
        goods.put("Bicycle", bicycle);
    }
}
