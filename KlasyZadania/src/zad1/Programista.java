package zad1;

/**
 * Created by Krzysztof Kaczynski on 15:31 - 30.04.2021.
 */
public class Programista {
  //  public static void main(String[] args) {
        private String imie;
        private String nazwisko;
        private String jezyk;
        private double zarobki;

    public Programista(String podajImie, String podajNazwisko, String podajJezyk, double podajZarobki) {
        imie = podajImie;
        nazwisko = podajNazwisko;
        jezyk = podajJezyk;
        zarobki = podajZarobki;
    }

    public String pobierzImie() {
            return imie;
        }

        public String pobierzNazwisko() {
            return nazwisko;
        }

        public String pobierzJezyjki() {
            return jezyk;
        }

        public double popbierzZarobki() {
            return zarobki;
        }
    }
//}
