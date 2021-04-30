package com.nazwa.app.jeden;

/**
 * Created by Krzysztof Kaczynski on 07:56 - 30.04.2021.
 */
public class KlasaA {

    public int polePubliczne; // dostepny wszedzie
    protected int poleDziedziczenie; // dost. w dziedziczeniu oraz w tym samym package'u
    private int polePrywatne; // dost. w tej klasie
    int poleBezNiczego; // package - dostep w tym samym package'u
}
