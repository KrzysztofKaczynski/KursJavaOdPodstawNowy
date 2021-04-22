package petle_tablice;

/**
 * Created by Krzysztof Kaczynski on 17:48 - 22.04.2021.
 */
public class PetleTablice {
    public static void main(String[] args) {

        int[] tab = new int[100];

        for (int i = 0; i < 100; i++) {
            tab[i] = i;
        }
        for (int i = 0; i < tab.length; i++) {
            System.out.println("tab " + i + ": " + tab[i]);
        }
    }
}
