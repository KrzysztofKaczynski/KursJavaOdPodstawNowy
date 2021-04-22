package petla_brake_continue;

/**
 * Created by Krzysztof Kaczynski on 19:10 - 21.04.2021.
 */
public class PetlaBreakContinue {
    public static void main(String[] args) {

        int zmienna;
        for (zmienna = 1; zmienna <= 5; zmienna ++) {
            System.out.println("Przed continue: " + zmienna);
            if (zmienna == 3) {
                continue;
            }
            System.out.println("Zmienna: " + zmienna);
        }

        for (zmienna = 1; zmienna <= 5; zmienna ++) {
            if (zmienna == 3) {
                break;
            }
            System.out.println("Zmienna w drugiej pętli: " + zmienna);
        }
    }
}
