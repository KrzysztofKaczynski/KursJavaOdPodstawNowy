package zadanie_dziedziczenie;

/**
 * Created by Krzysztof Kaczynski on 07:15 - 10.05.2021.
 */
public class Pracownik extends Osoba {

    protected String stanowisko;
    protected String nazwaFirmy;

    public Pracownik(String imie, String nazwisko, String stanowisko, String nazwaFirmy) {
        super(imie, nazwisko);
        this.stanowisko = stanowisko;
        this.nazwaFirmy = nazwaFirmy;
    }

    @Override
    public void przedstawSie() {
        super.przedstawSie();
        System.out.println(" i pracuje w firmie:  " + nazwaFirmy + " na stanowisku: " + stanowisko);
    }
}
