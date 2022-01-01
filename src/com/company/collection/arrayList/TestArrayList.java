package com.company.collection.arrayList;

import com.company.OOP.Hero;

import java.util.ArrayList;
import java.util.Iterator;

public class TestArrayList {
    public static void main(String[] args) {
        //arrayList的方法
        Hero heros[] = new Hero[10];//这是数组
        ArrayList<Hero> arl = new ArrayList();
        for (int i = 0; i < 5 ; i++) {
            arl.add(new Hero("hero" + i));

        }
        System.out.println(arl);

        arl.add(3,new Hero("specialHero"));
        System.out.println(arl);
        Hero speHero = new Hero("specialAdHero");
        arl.add(speHero);


        System.out.println(arl.contains(new Hero("hero1")));
        System.out.println(arl.contains(speHero));

        arl.get(5);
        arl.indexOf(speHero);

        arl.remove(speHero);
        arl.remove(2);

        arl.set(1, new Hero("otherHero"));

        arl.size();
        System.out.println("----------遍历array List 之 for循环");
        //遍历array List
        for (int i = 0; i < arl.size(); i++) {
            Hero h = arl.get(i);
            System.out.println(h);
        }

        System.out.println("-------迭代器while遍历");
        Iterator<Hero> it = arl.iterator();
        while (it.hasNext()) {
            Hero h = it.next();
            System.out.println(h);
        }

        System.out.println("********for迭代器");
        for (Iterator<Hero> iterator = arl.iterator(); iterator.hasNext();) {
            Hero hero = iterator.next();
            System.out.println(hero);
        }

        System.out.println("---------forEch");
        for (Hero h:arl) {
            System.out.println(h);
        }


    }
}
