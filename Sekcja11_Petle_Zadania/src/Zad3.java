/**
 * Created by Krzysztof Kaczynski on 20:18 - 22.04.2021.
 */
public class Zad3 {
    public static void main(String[] args) {
      /*
      3. Podaj dwie dowolne liczby a i b, gdzie a jest mniejsze od b (a < b). Wypisz na ekran zakres liczb od a do b.
       */
        int a = 0;
        int b = 30;
        for (int krok = a; krok <= b; krok++) {
            System.out.print(krok + " ");
        }
    }
}