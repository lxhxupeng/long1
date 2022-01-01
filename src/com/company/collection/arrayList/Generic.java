package com.company.collection.arrayList;

import com.company.OOP.Hero;
import com.company.OOP.Item;

import java.util.ArrayList;
import java.util.List;

public class Generic {
    public static void main(String[] args) {
        List<Hero> heros = new ArrayList<>();
        heros.add(new Hero());

        List<Item> items = new ArrayList<>();
        items.add(new Item());
    }
}
