package com.company.OOP;

public class APHero extends Hero implements AP,Mortal {
    @Override
    public void magicAttack() {
        System.out.println("AP 魔法");
    }

    @Override
    public void die() {
        System.out.println("AP is killed");
    }
}
