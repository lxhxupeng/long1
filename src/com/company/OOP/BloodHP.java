package com.company.OOP;

public class BloodHP {
    public int age;
    String name;

    public BloodHP(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String name = "YALU";
        BloodHP b = new BloodHP(name);
        BloodHP p = new BloodHP(name);

        System.out.println(b);
        System.out.println(p);
    }
}
