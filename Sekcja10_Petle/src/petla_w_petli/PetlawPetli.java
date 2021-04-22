package petla_w_petli;

/**
 * Created by Krzysztof Kaczynski on 18:26 - 22.04.2021.
 */
public class PetlawPetli {
    public static void main(String[] args){

        int licznik = 0;
        int [][] tablica = new int[5][10];

        for (int i = 0; i < 5; i++){
            for (int j = 0; j < 10; j++){
                licznik ++;
                tablica[i][j] = licznik;
            }
        }
        for (int i = 0; i < 5; i++) {
            for (int j = 0; j < 10; j++) {
                System.out.print(tablica[i][j] + " ");
            }
            System.out.println();
        }
    }
}
/*
1 2 3 4 5 6 7 8 9 10
11 12 13 14 15 16 17 18 19 20
21 22 23 24 25 26 27 28 29 30
31 32 33 34 35 36 37 38 39 40
41 42 43 44 45 46 47 48 49 50
 */