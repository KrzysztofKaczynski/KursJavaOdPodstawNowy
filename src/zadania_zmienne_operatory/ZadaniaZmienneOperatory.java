package zadania_zmienne_operatory;

public class ZadaniaZmienneOperatory {
    /*
    1. Utwórz program, w którym stworzysz zmienne i przypiszesz do tych zmiennych wartości takie jak Twój wiek, wzrost,
     waga. Niech będą w jednostkach lata, metry, kilogramy odpowiednio. Będziesz potrzebował 3 zmienne.
     Zastanów się nad nazewnictwem oraz typem zmiennych. Na koniec wypisz wszystko na ekran.
     */
    public static void main(String[] args) {

        int  wiek = 50;
        float wzrost = 1.92f;
        float waga = 142.5f;

        System.out.println("wiek: " + wiek);
        System.out.println("wzrost: " + wzrost);
        System.out.println("waga: " + waga);

        float bmi = waga / (float) Math.pow(wzrost, 2);
        System.out.println("BMI: " + bmi);

        /*
        Co ujrzymy na ekranie ?
         */
        int x = 5;
        boolean wynikPierwszy = x < 10 || x != 0 || x > -1; // || - lub
        boolean wynikDrugi = x < 10 && x !=0 && x > -1;     // && - i

        System.out.println("Wynik pierwszy: " + wynikPierwszy);
        System.out.println("Wynik pierwszy: " + wynikDrugi);

        /*
        Przypisz wartość przekraczającą poza int
         */

        int mojInt = 1000000000;
        int pozaInt = mojInt + mojInt + mojInt;
        int pozaIntInnySposob = Integer.MAX_VALUE;
        System.out.println("Poza int: " + pozaInt);
        System.out.println("Poza int: " + pozaIntInnySposob);

    }
}
