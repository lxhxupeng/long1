package com.company.oopPractic;

public class Spider extends Animal {


    public Spider(int legs) {
        super(8);
    }

    @Override
    public void eat() {
        System.out.println("吃蚊子");
    }
}
