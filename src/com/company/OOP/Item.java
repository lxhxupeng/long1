package com.company.OOP;

public class Item extends Object{
    private String name;
    private int price;

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public int getPrice() {
        return price;
    }

    public void setPrice(int price) {
        this.price = price;
    }

    void effect() {
        System.out.println("使用物品");
    }

    public String toString() {
        return name;
    }

    public static void main(String[] args) {
        Item item = new Item();
        item.setName("set");
        System.out.println(item.toString());
    }


}
