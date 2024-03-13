package org.example;

import java.util.Random;

public class Coupe {
    public int coupe() {
        Random r = new Random();
        return r.nextInt(1) == 0 ? 1 : 40;
    }
}
