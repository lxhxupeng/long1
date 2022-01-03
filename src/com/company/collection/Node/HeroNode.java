package com.company.collection.Node;

import com.company.OOP.Hero;

import java.util.ArrayList;
import java.util.Collection;
import java.util.List;

/*
* 设计一个Hero二叉树，HeroNode.
可以向这个英雄二叉树插入不同的Hero对象，并且按照Hero的血量倒排序。
随机生成10个Hero对象，每个Hero对象都有不同的血量值，插入这个HeroNode后，把排序结果打印出来。
* */
public class HeroNode {
    public HeroNode leftNode;
    public HeroNode rightNode;
    public Hero hero;
    //插入值
    public void add(Hero h) {
        if (hero == null) {
            hero = h;
        }
        else{
            if (h.hp - hero.hp <= 0) {
                if (leftNode == null)
                    leftNode = new HeroNode();
                leftNode.add(h);
            }
            else {
                if (rightNode == null) {
                    rightNode = new HeroNode();
                }
                rightNode.add(h);
            }
        }

    }

    public List<Object> ls() {
        List<Object> lists = new ArrayList<>();
        if (null!= rightNode) {
            lists.addAll(rightNode.ls());// 回调自己本身  这就是递归  递归调用
        }
        lists.add(hero);
        if (null != leftNode) {
            lists.addAll(leftNode.ls());
        }
        return lists;
    }

    public static void main(String[] args) {
        List<Hero> heroList = new ArrayList<>();
        for (int i = 0; i <10 ; i++) {
            Hero hero = new Hero("hero "+i);
            hero.hp = (int) (1+Math.random()*(100-10+1));
            heroList.add(hero);
            System.out.println(hero+ "  blood  "+ hero.hp);
        }
        HeroNode heroNode = new HeroNode();
        for (Hero h:heroList
             ) {
            heroNode.add(h);
        }
        System.out.println(heroNode.ls());
    }
}
