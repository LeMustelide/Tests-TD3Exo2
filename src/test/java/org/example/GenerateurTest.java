package org.example;

import org.junit.jupiter.api.Assertions;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;
import org.junit.jupiter.api.extension.ExtendWith;
import org.mockito.Mock;
import org.mockito.Spy;
import org.mockito.junit.jupiter.MockitoExtension;

import static org.mockito.Mockito.doReturn;

@ExtendWith(MockitoExtension.class)
public class GenerateurTest {

    @Mock
    private F f;

    @Mock
    private S s;

    @Mock
    private Coupe c;

    @Mock
    private Coupe coupe;

    @Spy
    private Generateur generateur;

    private G g;


    @BeforeEach
    public void setUp() {
        g = new G();
    }


    // Gn = 1
    @Test
    public void testG1() {
        doReturn(1).when(s).Syracus(0);
        doReturn(1).when(f).fibonasuite(0);
        doReturn(1).when(c).coupe();
        doReturn(0).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(1, g.getGn());
    }

    // Gn = 4
    @Test
    public void testG4() {
        doReturn(4).when(s).Syracus(1);
        doReturn(1).when(f).fibonasuite(1);
        doReturn(1).when(c).coupe();
        doReturn(1).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(4, g.getGn());
    }

    // Gn = 2
    @Test
    public void testG2() {
        doReturn(2).when(s).Syracus(2);
        doReturn(2).when(f).fibonasuite(2);
        doReturn(1).when(c).coupe();
        doReturn(2).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(2, g.getGn());
    }

    // Gn = 89
    @Test
    public void testG89() {
        doReturn(4).when(s).Syracus(10);
        doReturn(89).when(f).fibonasuite(10);
        doReturn(1).when(c).coupe();
        doReturn(10).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(89, g.getGn());
    }

    // Gn = 6765
    @Test
    public void testG6765() {
        doReturn(4).when(s).Syracus(19);
        doReturn(6765).when(f).fibonasuite(19);
        doReturn(1).when(c).coupe();
        doReturn(19).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(6765, g.getGn());
    }

    // Gn = 10946
    @Test
    public void testG10946() {
        doReturn(4).when(s).Syracus(20);
        doReturn(10946).when(f).fibonasuite(20);
        doReturn(1).when(c).coupe();
        doReturn(20).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(10946, g.getGn());
    }

    // Gn = 2
    @Test
    public void testG2Bis() {
        doReturn(1).when(s).Syracus(0);
        doReturn(1).when(f).fibonasuite(0);
        doReturn(40).when(c).coupe();
        doReturn(0).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(2, g.getGn());
    }

    // Gn = 5
    @Test
    public void testG5() {
        doReturn(4).when(s).Syracus(1);
        doReturn(1).when(f).fibonasuite(1);
        doReturn(40).when(c).coupe();
        doReturn(1).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(5, g.getGn());
    }

    // Gn = 4
    @Test
    public void testG4Bis() {
        doReturn(2).when(s).Syracus(2);
        doReturn(2).when(f).fibonasuite(2);
        doReturn(40).when(c).coupe();
        doReturn(2).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(4, g.getGn());
    }

    // Gn = 10
    @Test
    public void testG10() {
        doReturn(4).when(s).Syracus(10);
        doReturn(89).when(f).fibonasuite(10);
        doReturn(40).when(c).coupe();
        doReturn(10).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(89, g.getGn());
    }

    // Gn = 6765
    @Test
    public void testG6765Bis() {
        doReturn(4).when(s).Syracus(19);
        doReturn(6765).when(f).fibonasuite(19);
        doReturn(40).when(c).coupe();
        doReturn(19).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(6765, g.getGn());
    }

    // Gn = 10946
    @Test
    public void testG10946Bis() {
        doReturn(4).when(s).Syracus(20);
        doReturn(10946).when(f).fibonasuite(20);
        doReturn(40).when(c).coupe();
        doReturn(20).when(generateur).random();
        g.go(s, f, c, generateur);
        Assertions.assertEquals(10946, g.getGn());
    }
}
