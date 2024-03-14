package org.example;

import static java.lang.Math.max;

public class G {
    private int Fn;
    private int Sn;
    private int Gn;
    public void go(S s, F f, Coupe coupe, Generateur generateur) {
        int n = generateur.random();
        Fn = f.fibonasuite(n);
        Sn = s.Syracus(n);
        traitement(coupe.coupe());
    }

    public int getFn() {
        return Fn;
    }

    public void setFn(int fn) {
        Fn = fn;
    }

    public int getSn() {
        return Sn;
    }

    public void setSn(int sn) {
        Sn = sn;
    }

    public int getGn() {
        return Gn;
    }

    public void setGn(int gn) {
        Gn = gn;
    }

    public void traitement(int coupe) {
        // vérifier si Sn et Fn sont bien définis
        if (Sn == 0 || Fn == 0) {
            System.out.println("Erreur : Sn ou Fn non défini");
            return;
        } else {
            if(Sn+Fn<coupe) {
                setGn(Sn+Fn);
            } else {
                setGn(max(Sn,Fn));
            }
        }

    }
}
