package com.company.keyMap;

import org.junit.Assert;
import org.junit.jupiter.api.Test;

import static org.junit.Assert.*;

class QuickKeyTest {
    @Test
    public void should_return_Ture() {
        Assert.assertTrue(new QuickKey("beta").checkName("beta"));
    }
}