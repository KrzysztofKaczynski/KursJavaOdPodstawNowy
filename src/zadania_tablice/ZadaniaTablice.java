package zadania_tablice;

import java.util.Arrays;

public class ZadaniaTablice {
    public static void main(String[] args){
      /*
      1. Uzupełnij tablicę typu int rozmiaru 5 dowolnymi wartościami.
        Następnie zsumuj wszystkie elementy tej tablicy i wynik wypisz na ekran.
        Sumowania dokonaj poprzez dodawanie elementów odwołując się do indeksów tablicy.
       */
        int[] tab = new int[5];
        tab[0] = 5;
        tab[1] = 3;
        tab[2] = 4;
        tab[3] = 6;
        tab[4] = 7;
        int suma = tab[0] + tab[1] + tab[2] + tab[3] + tab[4];

        System.out.println("Suma: " + suma);

        int[] tab2 = {1, 1, 1, 1, 1};
        int suma2 = tab2[0] + tab2[1] + tab2[2] + tab2[3] + tab2[4];

        System.out.println("Suma: " + suma2);


      /*
        2. Utwórz tablicę dwuwymiarową typu double wymiaru 3x5 i także wypełnij dowolnymi wartościami.
         Tym razem zsumuj elementy z każdego wiersza osobno i wypisz wynik na ekran.
       */

        double[][] tab3 = new double[3][5];
        tab3[0][0] = 1.1;

        double [][] tab4= {
                {0.0, 0.1, 0.2, 0.3, 0.4},
                {1.0, 1.1, 1.2, 1.3, 1.4},
                {2.0, 2.1, 2.2, 2.3, 2.4},
        };

        System.out.println("Zawartość tablicy tab4: " + Arrays.toString(tab4));
        System.out.println("Suma wszystkich elementów tablicy: " + zliczTblice(tab4));
    }
    public static double zliczTblice(double[][] tab4) {
        double wynik = 0;
        for (double element : tab4) {
            wynik += element;
        }
        return wynik;
    }
}
