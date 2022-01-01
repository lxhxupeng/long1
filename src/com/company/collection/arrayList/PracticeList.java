package com.company.collection.arrayList;

/*
* 首先初始化一个Hero集合，里面放100个Hero对象，名称分别是从
hero 0
hero 1
hero 2
...
hero 99.
通过遍历的手段，删除掉名字编号是8的倍数的对象
* */

//有多个不同的方法能完成这个功能  还有一种是删除它的步长 8

import com.company.OOP.Hero;

import java.util.ArrayList;
import java.util.List;

public class PracticeList {
    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<>();
        List<Hero> delet = new ArrayList<>();
        for (int i = 0; i < 100; i++) {
            heroList.add(new Hero("hero " + i));
        }
        System.out.println(heroList);

        for (Hero h:heroList
             ) {
            int number = Integer.parseInt((h.name.substring(5)));
            if (0 == number % 8){
                delet.add(h);
            }
        }

        for (Hero h:delet
             ) {
            heroList.remove(h);
        }
        System.out.println(heroList);
    }
}
