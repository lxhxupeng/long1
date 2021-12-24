package com.company.OOP;

/**
 * 接口 实现多态练习
 * 下面在实现的时候  adc.die  apc.die  sp.die  这就是重复的代码
 * 那么 可以直接放在 Hero里面  用m.die 来代替
 *  这就是多态  添加后 就会打印重复调用 die的方法
 *    别人的回复：”接口可以创建对象的引用，指向实现了该接口的类的对象。但引用变量只能调用接口本身提供的方法（在类中被重写的）“
 */
public interface Mortal {
    void die();

    public static void main(String[] args) {
        Hero gailun = new Hero();
        ADHero adc = new ADHero();
        APHero apc = new APHero();
        Support sp = new Support();
        gailun.kill(adc);
        adc.die();
        gailun.kill(apc);
        apc.die();
        gailun.kill(sp);
        sp.die();
    }
}
