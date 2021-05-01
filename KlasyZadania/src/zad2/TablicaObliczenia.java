package zad2;

/**
 * Created by Krzysztof Kaczynski on 08:36 - 01.05.2021.
 */
public class TablicaObliczenia {
    /*
    2. Napisz klasę, która w konstruktorze będzie przyjmować tablicę oraz będzie posiadać cztery metody:
- zliczającą sumę wszystkich elementów z tablicy
- liczącą średnią
- znajdującą wartość najmniejszą
- znajdującą wartość największą

Każda z metod powinna zwracać wynik jako int.
Utwórz pole przechowujące tablicę. Załóż, że w tablicy będą tylko liczby całkowite.
Pola będą prywatne a metody i konstruktor publiczne.
Klasę, pole i metody nazwij według własnego uznania.
Przetestuj całość w main.
     */
    private int[] tablica;

    public TablicaObliczenia(int[] podajTablice) {
        tablica = podajTablice;
    }

    public int suma() {
        int suma = 0;
        for (int i = 0; i < tablica.length; i++) {
            suma += tablica[i];
        }
        return suma;
    }

    public int srednia() {
        return suma() / tablica.length;
    }

    public int min() {
        int min = Integer.MAX_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] < min) {
                min = tablica[i];
            }
        }
        return min;
    }

    public int max() {
        int max = Integer.MIN_VALUE;
        for (int i = 0; i < tablica.length; i++) {
            if (tablica[i] > max) {
                max = tablica[i];
            }
        }
        return max;
    }
}
