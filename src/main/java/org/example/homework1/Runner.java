package org.example.homework1;

import org.example.homework1.config.Config;
import org.example.homework1.entity.*;
import org.springframework.context.annotation.AnnotationConfigApplicationContext;

public class Runner {
    public static void main(String[] args) {
        AnnotationConfigApplicationContext context = new AnnotationConfigApplicationContext(Config.class);
        Storage storage = context.getBean(Storage.class);
        Absolute absolute = context.getBean(Absolute.class);
        Aist aist = context.getBean(Aist.class);
        Petrovich petrovich = context.getBean(Petrovich.class);
        Reshar reshar = context.getBean(Reshar.class);

        storage.acceptVodka(absolute.deliverGoods(3));
        storage.acceptBicycle(aist.deliverGoods(3));

        petrovich.buyVodka();
        reshar.buyBicycle();
        System.out.println(petrovich);
        System.out.println(reshar);
    }
}
