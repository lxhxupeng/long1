package com.company.OOP;

public interface AP {
    void magicAttack();

    default void attact() {
        System.out.println("AP attact");
    }



}
