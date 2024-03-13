package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class STest {

    @BeforeEach
    public void setUp() {
        S s = new S();
    }

    @Test
    public void testSyracus() {
        S s = new S();
        s.Syracus(1);
        Assertions.assertEquals(1, s.Syracus(1));
    }

    @Test
    public void testSyracus2() {
        S s = new S();
        Assertions.assertEquals(1, s.Syracus(2));
    }

    @Test
    public void testSyracus3() {
        S s = new S();
        Assertions.assertEquals(10, s.Syracus(3));
    }
}
