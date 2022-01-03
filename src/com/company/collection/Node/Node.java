package com.company.collection.Node;

import javax.management.ObjectName;
import java.util.ArrayList;
import java.util.List;

/*
* 二叉树
* */
public class Node {
//    左节点
    public Node leftNode;
//   右节点
    public Node rightNoed;
    //值
    public Object value;

    public void add(Object v) {
        if (value == null) {
            value = v;
        }
        else {
            if ((Integer) v - ((Integer) value) <= 0) {
                if (leftNode == null)
                    leftNode = new Node();
                leftNode.add(v);
            } else {
                if (rightNoed == null) {
                    rightNoed = new Node();
                }
                rightNoed.add(v);
            }
        }

    }

    //中序遍历所有节点
    public List<Object> values() {
        List<Object> values = new ArrayList<>();
        if (null != leftNode) {
            values.addAll(leftNode.values());
        }
        values.add(value);
        if (null != rightNoed) {
            values.addAll(rightNoed.values());
        }
        return values;
    }


    public static void main(String[] args) {
        int randoms[] = new int[]{67, 7, 30, 73, 10, 0, 78, 81, 10, 74};
        Node roots = new Node();
        for (int number:randoms
             ) {
            roots.add(number);
        }
        System.out.println(roots.values());
    }
}
