package com.company.面向对象;

public class Hero {
    public String name;
    public float hp;
    public float armor;
    public int moveSpeed;
    void legendary(){
        System.out.println("超神");
    }
    float getHp(){
        return this.hp;
    }

    float recovery(float blood){
       return this.hp = hp+blood;
    }

}

