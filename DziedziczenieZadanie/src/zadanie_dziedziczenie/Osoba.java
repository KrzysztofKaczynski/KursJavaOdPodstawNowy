package zadanie_dziedziczenie;

/**
 * Created by Krzysztof Kaczynski on 07:13 - 10.05.2021.
 */
public class Osoba {

    protected String imie;
    protected String nazwisko;

    public Osoba(String imie, String nazwisko) {
        this.imie = imie;
        this.nazwisko = nazwisko;
    }

    public void przedstawSie() {
        System.out.printf("Jestem " + imie + " " + nazwisko);
    }
}


