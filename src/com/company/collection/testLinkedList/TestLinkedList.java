package com.company.collection.testLinkedList;

import com.company.OOP.Hero;

import java.util.LinkedList;

public class TestLinkedList {
    public static void main(String[] args) {
        LinkedList<Hero> ll = new LinkedList<>();
        ll.addLast(new Hero("gailun"));
        ll.addFirst(new Hero("zoushou"));
        ll.add(new Hero("timo"));
        ll.add(2,new Hero("feike"));
        System.out.println(ll);
        System.out.println("获取第一个"+ll.getFirst());
        System.out.println("获取最后一个"+ll.getLast());
        System.out.println("peek"+ll.peek());//peek 查看第一个
        System.out.println("poll"+ll.poll());//取出第一个
        System.out.println("pop"+ll.pop());;//推出第一个数据
        ll.push(new Hero("nanqiang"));//压入一个数据  在第一个   FIFO 队列  queue
        System.out.println(ll);

        ll.offer(new Hero("fenghuan")); //在末尾添加一个数据
        ll.offerFirst(new Hero("yasuo"));
        ll.offerLast(new Hero("guanhui"));
        System.out.println(ll);

    }
}
