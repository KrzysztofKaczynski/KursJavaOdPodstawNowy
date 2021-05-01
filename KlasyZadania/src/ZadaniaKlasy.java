import zad1.Programista;
import zad2.TablicaObliczenia;
import zad3.Matma;

/**
 * Created by Krzysztof Kaczynski on 15:49 - 30.04.2021.
 */
public class ZadaniaKlasy {
    public static void main(String[] args) {

        Programista programista = new Programista("Krzysztof", "Kaczynski", "Java", 4100);
        System.out.print("imie: " + programista.pobierzImie() + " nazwisko: " + programista.pobierzNazwisko() + " jezyk prog.: " + programista.pobierzJezyjki() + " zarobki: " + programista.popbierzZarobki());

        System.out.println();

        int[] tablica = {5, 59, 56, 78, 12, 44, 3};
        TablicaObliczenia tablicaObliczenia = new TablicaObliczenia(tablica);
        System.out.println("Suma: " + tablicaObliczenia.suma());
        System.out.println("Srednia: " + tablicaObliczenia.srednia());
        System.out.println("Min: " + tablicaObliczenia.min());
        System.out.println("Max: " + tablicaObliczenia.max());

        System.out.println("Obwod koła: " + Matma.obwodKola(5));
        System.out.println("Pole koła: " + Matma.poleKola( 5));
        System.out.println("Obwód prostokąta: " + Matma.obwodProstokata(5, 9));
        System.out.println("Pole prostokąta: " + Matma.poleProstokata(5,  9));
    }


}