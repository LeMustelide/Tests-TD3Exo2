package org.example;

import java.util.Random;

public class Coupe {
    private Random r = new Random();
    public int coupe() {
        return r.nextInt(1) == 0 ? 1 : 40;
    }
}
