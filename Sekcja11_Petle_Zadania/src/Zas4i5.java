/**
 * Created by Krzysztof Kaczynski on 07:39 - 24.04.2021.
 */
public class Zas4i5 {
    public static void main(String[] args) {
        /*
        4. Utwórz tablicę rozmiaru 10 elementów i uzupełnij liczbami. Wypisz wszystkie liczby z tej tablicy na ekran.
         Następnie wypisz wszystkie liczby od tyłu.
         */

        int[] tab = {12, 56, 565, 56, 35, 98, 888, 999, 666, 333, -1};
        System.out.println("Rozmiar: " + tab.length);
        for (int j : tab) {
            System.out.print(j + " ");
        }
        System.out.println();
        for (int i = tab.length - 1; i >= 0; i--) {
            System.out.print(tab[i] + " ");
        }
        /*
        5. Wykorzystując tablicę z poprzedniego zadania, oblicz sumę wszystkich jej elementów.
         */
        System.out.println("Zadanie 5");
        int wynik = 0;
        for (int j : tab) {
            wynik += j;
        }
        System.out.println("Wynik: " + wynik);

    }

}
