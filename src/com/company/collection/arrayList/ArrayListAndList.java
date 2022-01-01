package com.company.collection.arrayList;

import com.company.OOP.Hero;

import java.util.ArrayList;
import java.util.List;

public class ArrayListAndList {
    public static void main(String[] args) {
        //ArrayList 实现List接口
        //把接口引用声明为List类型  接口引用向下转型指向子类  多态
        List heros = new ArrayList();
        heros.add(new Hero());
        System.out.println(heros.size());
    }
}
