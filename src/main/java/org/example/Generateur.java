package org.example;

import java.util.Random;

public class Generateur {
    private Random r = new Random();

    public int random() {
        return r.nextInt(20);
    }
}
