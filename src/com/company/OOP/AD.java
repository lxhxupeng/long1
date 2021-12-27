package com.company.OOP;

public interface AD {

     void pyhsicAttack();

    default void attact() {
        System.out.println("AD attack");
    }

}
