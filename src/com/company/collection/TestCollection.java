package com.company.collection;

import com.company.OOP.Hero;

import java.util.ArrayList;

public class TestCollection {
    public static void main(String[] args) {
        Hero heros[] = new Hero[10];
        heros[0] = new Hero("gailun");

        ArrayList arrayList = new ArrayList();
        arrayList.add(new Hero("timo"));

    }
}
