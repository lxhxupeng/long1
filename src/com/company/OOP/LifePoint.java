package com.company.OOP;

public class LifePoint extends Item {
    public void effect() {
        System.out.println("use bloodpool + 1");
    }

    public static void main(String[] args) {
        Item i = new Item();
        i.effect();
        LifePoint lifePoint = new LifePoint();
        lifePoint.effect();
        MagicPoint mp = new MagicPoint();
        mp.effect();

    }
}
