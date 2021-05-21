/**
 * Created by Krzysztof Kaczynski on 09:17 - 16.05.2021.
 */
public class MainWyjatkiObsluga {
    static String str;
    public static void main(String[] args) {
        try {
            str.isEmpty();
            } catch (NullPointerException wyjatek) {
            System.out.println("Nie utworzyłeś stringa");
        }

        int[] tablica = new int[2];
        try {
            tablica[0] = 100;
            tablica[1] = 200;
            tablica[2] = 3000;
            System.out.println("Wszystko OK");

        }catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Jesteś poza zakresem Tablicy");
        }
        System.out.println("Wszystko działa");
    }
}
