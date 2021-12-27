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

    public ADHero() {
        System.out.println("ADHero Constructor");
    }

    public ADHero(String name) {
        super(name);
        System.out.println("ADHero Constructor one parameter");
    }

    public static void main(String[] args) {
        new ADHero();
        new ADHero("Delaiwen");

    }
}
