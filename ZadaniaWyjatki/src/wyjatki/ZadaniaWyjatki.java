package wyjatki;

import wyjatki.zadanie3.Matma;

import static wyjatki.zadanie3.Matma.*;

/**
 * Created by Krzysztof Kaczynski on 09:01 - 22.05.2021.
 */
public class ZadaniaWyjatki {
    public static void main(String[] args) {
        /*
Utwórz package "wyjatki" i w nim umieszczaj tworzone klasy.

Zadanie 1
W metodzie main napisz kawałek kodu, który będzie dzielił liczby a/b (typu int) i wypisywał wynik na ekran.
 Zobacz co się stanie, jeżeli pod b podasz liczbę 0. Spróbuj obsłużyć błąd try/catchem,
  aby w przypadku dzielenia przez zero wyskoczył użytkownikowi komunikat:
“Nie wolno dzielić przez 0!”
(podpowiedź: należy obsłużyć wyjątek ArithmeticException)
         */
        try {
            int a = 6;
            int b = 0;
            System.out.println("Wynik dzielenia: " + a / b);
        } catch (ArithmeticException e) {
            System.out.println("Nie wolno dzielić przez zero");
        }
        /*
        Zadanie 2
Analogicznie do zadania 1, zaimplementuj metodę publiczną,
 statyczną (w tej samej klasie co metoda main) o nazwie “podziel”,
  która będzie przyjmować parametry a oraz b i zwracać wynik z dzielenia a/b.
   Utwórz własny wyjątek typu check, który będzie wyrzucany w przypadku podania liczby 0 w miejsce parametru b.
    Spróbuj wymyślić nazwę i pamiętaj o odpowiednim dziedziczeniu. Sprawdź działanie metody wywołując ją w main.
         */
        try {
            System.out.println("Wynik dzielenia z metody: " + podziel(6, 0));
        } catch (DzieleniePrzezZeroException e) {
            System.out.println(e.getMessage());
        }
    }

    public static int podziel(int a, int b) throws DzieleniePrzezZeroException {
        if (b == 0) {
            throw new DzieleniePrzezZeroException();
        }
        return a / b;

        /*
        Zadanie 3
Wróć do zadania 3 z działu o klasach (Matma), w którym były liczone m. in. obwody i pola.
 Stwórz wyjątek typu uncheck o nazwie "LiczbaUjemnaException".
  Uzupełnij metodę "obwodKola" - jeżeli promień będzie ujemny wyrzuć wyjątek "LiczbaUjemnaException".
   Przetestuj w main podając za promień liczbę ujemną.
         */

    }


    }


