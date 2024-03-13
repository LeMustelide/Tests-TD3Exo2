package org.example;

import java.util.Random;

public class Generateur {

    public int random() {
        Random r = new Random();
        return r.nextInt(20);
    }
}
