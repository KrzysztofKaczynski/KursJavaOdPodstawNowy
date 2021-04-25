/**
 * Created by Krzysztof Kaczynski on 08:46 - 24.04.2021.
 */
public class Zad6 {
    public static void main(String[] args) {
        /*
        Napisz program, który będzie obliczał silnię z nieujemnej liczby tj. jeżeli podamy liczbę 5,
         to zostanie obliczona 5! (wykrzyknik to znak silni). Obliczamy to w następujący sposób:
        5! = 5 * 4 * 3 * 2 * 1 = 120.
         */
        long liczba = 5;
        long wynikSilnia = 1;

        for(long i = liczba; i >= 1; i--) {
            wynikSilnia = wynikSilnia * i;
        }
        System.out.println("Wynik silnia: " + wynikSilnia);
    }
}
