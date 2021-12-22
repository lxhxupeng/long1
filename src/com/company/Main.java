package com.company;

import com.company.面向对象.Hero;
import com.company.面向对象.Item;

public class Main {

    public static void main(String[] args) {
	// write your code here
        Hero garen = new Hero();
        garen.name = "盖伦";
        garen.hp = 616.28f;
        garen.armor = 27.526f;
        garen.moveSpeed = 350;
        Hero teemo = new Hero();
        teemo.name = "提莫";
        teemo.hp = 383f;
        teemo.armor = 14f;
        teemo.moveSpeed = 330;

        System.out.println(garen.armor);
        System.out.println(teemo.name);

        Item pool = new Item();
        pool.setName("血瓶");
        pool.setPrice(50);
        Item shoot = new Item();
        shoot.setName("草鞋");
        shoot.setPrice(300);
        Item sword = new Item();
        sword.setName("长剑");
        sword.setPrice(350);
    }
}
