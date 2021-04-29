package zadania;

/**
 * Created by Krzysztof Kaczynski on 16:09 - 29.04.2021.
 */
public class ZadaniaString {
    public static void main(String[] args) {
        /*
        1. Utwórz trzy zmienne typu String. Do pierwszej przypisz swoje imię,
         do drugiej nazwisko oraz do trzeciej imię i nazwisko oddzielone spacją.
          Następnie wykonaj polecenia używając odpowiednich metod z String (nie robić nic ręcznie! :) )
          i wypisując informacje na ekran:
         */
        String imie = "Krzysztof";
        String nazwisko = "Kaczynski";
        String imieNazwisko = imie + " " + nazwisko;

       // a) wypisz ile znaków zawiera zmienna przechowująca imię, ile nazwisko a ile imię i nazwisko

        System.out.println("imie: " + imie.length());
        System.out.println("nazwisko: " + nazwisko.length());
        System.out.println(("imie i nazwisko: " + imieNazwisko.length()));

        // b) sprawdź czy Twoje imię jest równe "Alicja" lub "Jan"

        if(imie.equals("Alicja")) {
            System.out.println("Masz na imię Alicja");
        } else if (imie.equals("Jan")) {
            System.out.println("Masz na imię Jan");
        } else {
            System.out.println("Masz na imie: " + imie);
        }

        // c) wypisz nazwisko z WIELKICH LITER

        System.out.println(nazwisko.toUpperCase());

        // d) zamień w nazwisku litery 'a' na 'e' i zobacz czy coś się zmieniło

        System.out.println(nazwisko.replace('a', 'e'));
    }
}
