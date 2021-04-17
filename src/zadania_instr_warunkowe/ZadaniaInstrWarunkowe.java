package zadania_instr_warunkowe;

public class ZadaniaInstrWarunkowe {
    public static void main(String[] args) {
        /*
        1. Sprawdź czy wpisana liczba jest parzysta czy nieparzysta. Wypisz odpowiedni komunikat na ekran.
(podpowiedź: jeżeli reszta z dzielenia przez 2 jest równa 0 to znaczy, że liczba jest parzysta).
         */
        int liczba = 567;

        if (liczba % 2 == 0) {
            System.out.println(liczba + " Liczba jest parzysta");
        } else {
            System.out.println(liczba + " Liczba nie jest parzysta");
        }


                /*
                . Twoim zadaniem jest obliczenie podatku od dochodu.
                Obecnie wynosi on 17%. Wiemy, także doświadczeni programiści potrafią zarabiać pokaźne sumy,
                 a od pewnego dochodu zwiększony jest podatek do 32%.
                  Sprawdź ile podatku musiałby zapłacić początkujący programista, zanim przekroczy próg wynoszący 85 528 zł,
                   a ile już ten doświadczony.

            Wzór:
            dla dochodu do 85 528 zł podatek wynosi 17%,
            dla dochodu powyżej 85 528 zł liczy się go następująco:
            - obliczamy podatek 17% z 85 528,
            - dodatkowo obliczamy podatek 32% od nadwyżki ponad 85 528 zł,
            czyli dochód pomniejszony o 85 528 zł i z tego 32%.
            (oczywiście obliczamy orientacyjnie, gdyż nie bierzemy pod uwagę np. ulgi podatkowej).
                 */

        double kwota = 100596;
        if (kwota < 0) {
            System.out.println(" Nie płacisz podatku");
        } else if (kwota <= 85528.00) {
            double podatek = kwota * 0.17;
            System.out.println("Podatek do zapłaty wynosi: " + podatek);
        } else {
            double podatekPonizejProgu = 85528 * 0.17;
            double podatekPowyzejProgu = (kwota - 85528) * 0.32;
            double podatek = podatekPonizejProgu + podatekPowyzejProgu;
            System.out.println("Podtek powyzej 85528: " + podatek);
        }

                /*
                3. Napisz bardzo prosty kalkulator. Niech potrafi dodawać, odejmować, mnożyć i dzielić.
                 Co więcej, niech będzie na tyle prostym kalkulatorem,
                  że po podaniu  dwóch liczb, obliczy wynik i zakończy swoje działanie.
                    Dobrze jakbyś wykorzystał do tego instrukcję "switch" w celu jej przećwiczenia,
                 chociaż na początek możesz spróbować to zrobić "if'em".
                (podpowiedź: będziesz potrzebował co najmniej trzech zmiennych
                 - dwie zmienne do przechowywania liczb oraz trzecia zmienna jako znak operacji np. '+' dla dodawania)
                (podpowi
                 */

        double pierwszaLiczba = 10;
        double drugaLiczba = 5;
        char znak = '+';
        double wynik = 0;

        switch (znak) {
            case '+' -> wynik = pierwszaLiczba + drugaLiczba;
            case '-' -> wynik = pierwszaLiczba - drugaLiczba;
            case '*' -> wynik = pierwszaLiczba * drugaLiczba;
            case '/' -> wynik = pierwszaLiczba / drugaLiczba;
            default -> System.out.println("Podałeś nieprawidłowy znak!!!");
        }
        System.out.println(pierwszaLiczba + " " + znak + " " + drugaLiczba + " = " + wynik);


    }
}