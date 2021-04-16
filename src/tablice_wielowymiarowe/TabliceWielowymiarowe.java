package tablice_wielowymiarowe;

public class TabliceWielowymiarowe {
    public static void main(String[] args) {

        int[][] tablicaWielowymiarowa = new int[10][10];
        int[][] nowaTablica = {
                {1, 2, 3, 4, 5},
                {6, 7, 8, 9, 10}
        };
        System.out.println("[0][0]: " + nowaTablica[0][0]);
        System.out.println("[0][1]: " + nowaTablica[0][1]);
        System.out.println("[0][2]: " + nowaTablica[0][2]);
        System.out.println("[0][3]: " + nowaTablica[0][3]);
        System.out.println("[0][4]: " + nowaTablica[0][4]);
        System.out.println("[1][0]: " + nowaTablica[1][0]);
        System.out.println("[1][1]: " + nowaTablica[1][1]);
        System.out.println("[1][2]: " + nowaTablica[1][2]);
        System.out.println("[1][3]: " + nowaTablica[1][3]);
        System.out.println("[1][4]: " + nowaTablica[1][4]);

        System.out.println("Rozmiar tablicy: " + nowaTablica.length);
        System.out.println(nowaTablica[0].length);
        System.out.println(nowaTablica[1].length);


    }
}
