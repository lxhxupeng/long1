package com.company.collection.testLinkedList;


import com.company.OOP.Hero;

import java.util.LinkedList;

public class MyStack implements Stack {
    LinkedList<Hero> heroes = new LinkedList<>();


    @Override
    public void push(Hero h) {
        heroes.offer(h);
    }

    @Override
    public Hero pull() {
        return heroes.pollFirst();
    }

    @Override
    public Hero peek() {
        return heroes.peekLast();
    }

    public static void main(String[] args) {
        MyStack myStack = new MyStack();
        for (int i = 0; i < 5; i++) {
            myStack.push(new Hero("hero "+i));
        }
        System.out.println(myStack.heroes);//mystack  对象   mystack.heros 才是linkedList

        myStack.peek();
        for (int i = 0; i < myStack.heroes.size();) {//一直保持i=0 就不需要在i++和i--了  i++是先加加 后赋值给i
            System.out.println(myStack.pull());
//            i--;  //在没有i--的时候  最后linked list中还有两个对象 ？  因为stack在pull后size也就变小了，在循环到3的时候退出循环

        }
        System.out.println(myStack.heroes);

    }
}

interface Stack {

    void push(Hero h);

    Hero pull();

    Hero peek();
}


