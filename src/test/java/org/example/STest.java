package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

class STest {

    @BeforeEach
    void setUp() {
        S s = new S();
    }

    @Test
    void testSyracus() {
        S s = new S();
        s.Syracus(1);
        Assertions.assertEquals(1, s.Syracus(1));
    }

    @Test
    void testSyracus2() {
        S s = new S();
        Assertions.assertEquals(1, s.Syracus(2));
    }

    @Test
    void testSyracus3() {
        S s = new S();
        Assertions.assertEquals(10, s.Syracus(3));
    }
}
