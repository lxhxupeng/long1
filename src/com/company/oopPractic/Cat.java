package com.company.oopPractic;

public class Cat extends Animal implements Pet {
    private String name;

    @Override
    public String getName() {
        return this.name;
    }

    @Override
    public String setName() {
        return this.name;
    }

    @Override
    public void play() {

    }

    public Cat(String name) {
        super(4);
        this.name = name;
    }

    @Override
    public void eat() {
        System.out.println("eat fish");
    }

    public static void main(String[] args) {
        Cat cat = new Cat("mao");
        cat.eat();
        cat.walk();
    }
}
