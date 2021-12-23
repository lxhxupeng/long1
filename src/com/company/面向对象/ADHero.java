package com.company.面向对象;

public class ADHero extends Hero implements AD {
    @Override
    public void pyhsicAttack() {
        System.out.println("进行物理进攻");
    }
}
