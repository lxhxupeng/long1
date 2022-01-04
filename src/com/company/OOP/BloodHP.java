package com.company.OOP;

import org.junit.AfterClass;
import org.junit.Assert.*;
import junit.framework.Assert;
import org.junit.Test;
import static org.junit.Assert.assertEquals;
import static org.junit.Assert.assertTrue;


public class BloodHP {
    public int age;
    String name;

    public BloodHP(String name) {
        this.name = name;
    }

    public static void main(String[] args) {
        String name = "YALU";
        BloodHP b = new BloodHP(name);
        BloodHP p = new BloodHP(name);

        System.out.println(b);
        System.out.println(p);
        int a = 2;
        assertEquals(a,2);
        assertTrue(a == 2);

    }
}
