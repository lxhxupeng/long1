package com.company.OOP;

public class Support  extends Hero implements AP,AD,Healer,Mortal{
    @Override
    public void magicAttack() {
        System.out.println("magic attact");
    }

    @Override
    public void attact() {
//        AD.super.attact();
        AP.super.attact();
        System.out.println("我是重写后的方法");
    }

    @Override
    public void pyhsicAttack() {
        System.out.println("AD attact");
    }

    @Override
    public void heal() {
        System.out.println("heal hero");

    }

    @Override
    public void die() {
        System.out.println("sone fix heat is killed");
    }

    public static void main(String[] args) {
        Support support = new Support();
        support.attact();
    }
}
