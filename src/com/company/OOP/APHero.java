package com.company.OOP;

public class APHero extends Hero implements AP,Mortal {
    @Override
    public void magicAttack() {
        System.out.println("AP 魔法");
    }

    @Override
    public void die() {
        System.out.println("AP is killed");
    }

    public static void battleWin() {
        System.out.println("AP win ");
    }
/*
子类重写父类的方法
如果父类和子类创建的是静态方法，结果会调用引用所在的父类方法；
如果父类和子类创建的是非静态方法，结果会调用引用所指向的子类方法；*/
    public static void main(String[] args) {
        Hero.battleWin();
        APHero.battleWin();
        Hero h = new APHero(); // h是父类类型对象，但是指向一个子类对象
        h.battleWin();

    }
}
