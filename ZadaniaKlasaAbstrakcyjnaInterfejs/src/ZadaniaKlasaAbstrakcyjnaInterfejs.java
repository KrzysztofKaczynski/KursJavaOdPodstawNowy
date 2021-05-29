import zadania_abstrakcja_interfejs.zadanie1.GwiazdaSmierci;
import zadania_abstrakcja_interfejs.zadanie2.Kolo;
import zadania_abstrakcja_interfejs.zadanie2.Prostokat;

/**
 * Created by Krzysztof Kaczynski on 09:04 - 29.05.2021.
 */
public class ZadaniaKlasaAbstrakcyjnaInterfejs {
    public static void main(String[] args) {
        /*
        Utwórz package o nazwie “zadania_abstrakcja_interfejs”, a w nim kolejne package do każdego zadania

Zadanie 1
- stwórz klasę abstrakcyjną o nazwie “StacjaKosmiczna”
- dodaj metodę abstrakcyjną o nazwie “atakujLaserem”
- stwórz nową klasę o nazwie “GwiazdaSmierci”, która będzie dziedziczyć po klasie “StacjaKosmiczna”.
 Zaimplementuj metodę “atakujLaserem”, która wyświetli na ekranie “piu piu"
- przetestuj w main
*/
        GwiazdaSmierci gwiazdaSmierci = new GwiazdaSmierci();
        gwiazdaSmierci.atakujLaserem();
/*
Zadanie 2
- stwórz interfejs o nazwie "Figury", który będzie posiadał metody “obwod”, “pole”. Obydwie metody będą zwracały liczbę zmiennoprzecinkową
- stwórz dwie klasy “Kolo”, “Prostokat”, które będą implementowały ten interfejs
- dodaj konstruktor, w którym w klasie “Kolo” będzie przekazywany promień koła, a w klasie “Prostokat” długości dwóch boków prostokąta a i b
- zaimplementuj metody w obydwóch klasach, aby dokonywały poprawnych obliczeń
- pola będą prywatne a konstruktor i metody publiczne
- przetestuj w main
*/
        System.out.println("Zadanie 2: ");
        Kolo kolo = new Kolo(4);
        Prostokat prostokat = new Prostokat(4, 6);

        System.out.println("Pole koła: " + kolo.pole());
        System.out.println("Obwód koła: " + kolo.obwod());

        System.out.println("Pole prostokąta: " + prostokat.pole());
        System.out.println("Obwód prostokąta: " + prostokat.obwod());
        /*
Zadanie 3
Stwórz interfejs wewnętrzny o nazwie "Info" z metodą “wyswietlInfo” w klasie,
 w której masz metodę main. Przećwiczyć tworzenie klasy anonimowej tworząc ją w metodzie main i przesłoń metodę tak,
  aby wypisywała tekst “informacja wypisana z klasy anonimowej”.
   Następnie wywołaj tę metodę “wyswietlInfo” i sprawdź czy prawidłowo została stworzona klasa anonimowa.
         */
        System.out.println("Zadanie 3");
        Info infoAnonimowe = new Info() {

            @Override
            public void wyswietlInfo() {
                System.out.println("Informacja wypisana z klasy anonimowej");
            }
        };
        infoAnonimowe.wyswietlInfo();
    }

    interface Info {
        void wyswietlInfo();
    }
}
