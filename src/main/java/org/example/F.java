package org.example;

public class F {

    public int fibonasuite(int n) {
        if (n <= 1) {
            return n;
        }
        return fibonasuite(n - 1) + fibonasuite(n - 2);
    }
}
