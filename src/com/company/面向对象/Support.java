package com.company.面向对象;

public class Support  extends Hero implements AP,AD,Healer{
    @Override
    public void magicAttack() {
        System.out.println("magic attact");
    }

    @Override
    public void pyhsicAttack() {
        System.out.println("AD attact");
    }

    @Override
    public void heal() {
        System.out.println("heal hero");

    }
}
