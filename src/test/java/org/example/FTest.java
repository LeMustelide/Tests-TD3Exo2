package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

public class FTest {

    @BeforeEach
    public void setUp() {
        F f = new F();
    }

    @Test
    public void testFibonasuite() {
        F f = new F();
        f.fibonasuite(1);
        Assertions.assertEquals(1, f.fibonasuite(1));
    }

    @Test
    public void testFibonasuite2() {
        F f = new F();
        Assertions.assertEquals(1, f.fibonasuite(2));
    }

    @Test
    public void testFibonasuite3() {
        F f = new F();
        Assertions.assertEquals(2, f.fibonasuite(3));
    }

    @Test
    public void testFibonasuite4() {
        F f = new F();
        Assertions.assertEquals(3, f.fibonasuite(4));
    }

    @Test
    public void testFibonasuite10() {
        F f = new F();
        Assertions.assertEquals(55, f.fibonasuite(10));
    }
}
