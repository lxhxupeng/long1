package com.company.面向对象;

public class APHero extends Hero implements AP {
    @Override
    public void magicAttack() {
        System.out.println("AP 魔法");
    }
}
