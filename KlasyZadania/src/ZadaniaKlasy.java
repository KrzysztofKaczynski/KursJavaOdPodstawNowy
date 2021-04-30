import zad1.Programista;

/**
 * Created by Krzysztof Kaczynski on 15:49 - 30.04.2021.
 */
public class ZadaniaKlasy {
    public static void main(String[] args) {

        Programista programista = new Programista("Krzysztof", "Kaczynski", "Java", 4100);
        System.out.print("imie: " + programista.pobierzImie() + " nazwisko: " + programista.pobierzNazwisko() + " jezyk prog.: " + programista.pobierzJezyjki() + " zarobki: " + programista.popbierzZarobki());
    }
}
