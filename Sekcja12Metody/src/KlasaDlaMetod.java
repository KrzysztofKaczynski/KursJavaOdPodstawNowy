/**
 * Created by Krzysztof Kaczynski on 10:04 - 25.04.2021.
 */
public class KlasaDlaMetod {

    // typZwracany nazwaMetody(parametry) {}

    void metodaKtoraNicNieZwraca() {
        System.out.println("Wartość wypisana z metody");
    }

    void metodaKtoraPrzyjmujeArgument(int liczba, char pojZnak) {
        // liczba++;
        System.out.println("Wartość z metody: " + liczba + "" + pojZnak);
    }

    void nazewnictwoDowolneAleKolejnaMetoda(boolean czyPokazac, int liczba) {
        if (czyPokazac) {
            System.out.println("Liczba: " + liczba);
        } else {
            System.out.println("Nie pozwala pokazać!");
        }
    }

    int dodawanie(int a, int b) {
        int wynik = a + b;
        return wynik;
    }

    double dodajCosPoPrzecinku(double liczbaDouble) {
        double wynik = liczbaDouble + 0.55;
        return wynik;
    }

    boolean zamienWartoscLogiczna(boolean wartoscLogiczna) {
        return !wartoscLogiczna;
    }

    int zwrocOdWartosciLogicznej(boolean czyZwrocic, int liczba) {
        if (czyZwrocic) {
            return liczba;
        } else {
            return 0;
        }
    }

    int przykladKolejnej() {
        return 100;
    }

    void voidKtoryMialByCosZwrocic(boolean czyZakonczyc) {
        if (czyZakonczyc) {
            return;
        }
    }

}
