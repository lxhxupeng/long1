package com.company.collection.Node;

import com.company.OOP.Hero;
import org.junit.Assert;
import org.junit.Test;

class NodeTest {
    public static void main(String[] args) {

            int a = 2;
            Assert.assertEquals(a, 2);
            Node node = new Node();
            node.add(2);
            Assert.assertEquals(node.value, 2);

    }

}