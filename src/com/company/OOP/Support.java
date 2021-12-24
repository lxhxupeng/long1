package com.company.OOP;

public class Support  extends Hero implements AP,AD,Healer,Mortal{
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

    @Override
    public void die() {
        System.out.println("sone fix heat is killed");
    }
}
