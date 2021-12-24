package com.company.OOP;

public class Hero {
    public String name;
    public float hp;
    public float armor;
    public int moveSpeed;

    void legendary() {
        System.out.println("超神");
    }

    float getHp() {
        return this.hp;
    }

    float recovery(float blood) {
        return this.hp = hp + blood;
    }

    public void kill(Mortal mortal) {
        System.out.println("kill"+mortal);
        mortal.die();
    }


    public static void main(String[] args) {
        ADHero ad = new ADHero();
        AD adc = new ADHero(); //接口不能实例化  只有实现类才能实例化
        adc = ad;  //子类转父类
        ad = (ADHero) adc;  //父类转子类  强转

        AD adi = ad; //子类转接口
        ADHero adHero = (ADHero) adi;  //接口转实现类

        Support s = new Support(); //继承Hero，实现AP AD Healer接口
        Hero h = new Hero(); //父类
        h = s;  //子类转父类
        s = (Support) h;  //父类强转子类
        Healer healer = s;  //实现类转接口
        System.out.println(healer instanceof Support);
        System.out.println(healer instanceof Hero);
        System.out.println(healer instanceof Healer);





    }
}
