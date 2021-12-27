package com.company.oopPractic;

public abstract class Animal {


    private int legs;

    public Animal(int legs) {
        this.legs = legs;
    }


    public abstract void eat();


    public void walk() {
        System.out.println(this.legs+"行走");
    }
}
