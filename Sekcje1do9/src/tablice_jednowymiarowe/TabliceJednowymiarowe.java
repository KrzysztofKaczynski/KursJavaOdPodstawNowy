package tablice_jednowymiarowe;

public class TabliceJednowymiarowe {
    public static void main(String[] args) {
        // ang. arrays

        int[] tablica;
        tablica = new int[10];
        // tablica [index]
        tablica[0] = 5;
        tablica[1] = 10;
        tablica[2] = 15;
        tablica[3] = 155;

        System.out.println(tablica[9]);


        double[] tablicaDouble = new double[5];
        tablicaDouble[0] = 12.5;
        tablicaDouble[1] = 55.5;
        tablicaDouble[2] = 111.1;

        System.out.println(tablicaDouble[2]);

        int[] nowaTablica = {5, 10, 15, 155};
        System.out.println(nowaTablica[3]);

        System.out.println(nowaTablica.length);
    }

}
