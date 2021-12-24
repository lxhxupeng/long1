package com.company.OOP;

public class ADHero extends Hero implements AD,Mortal {
    @Override
    public void pyhsicAttack() {
        System.out.println("进行物理进攻");
    }

    @Override
    public void die() {
        System.out.println("AD is killed");
    }
}
