package petla_while;

public class PetlaWhile {
    public static void main(String[] args) {


        int liczenie = 99;

        while (liczenie <= 10) {
            System.out.println("Tekst " + liczenie);
            liczenie++;
        }

        liczenie = 99;
        do {
            System.out.println("Tekst z do while: " + liczenie);
            liczenie++;
        } while (liczenie <= 10);

    }
}
