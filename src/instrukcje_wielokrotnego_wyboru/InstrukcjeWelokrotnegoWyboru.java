package instrukcje_wielokrotnego_wyboru;

public class InstrukcjeWelokrotnegoWyboru {
    public static void main(String[] args) {

        int zmienna = 5;
        switch (zmienna) {
            case 1:
                System.out.println("Jeden");
                break;
            case 2:
                System.out.println("Dwa");
                break;
            case 3:
                System.out.println("Trzy");
                break;
            default:
                System.out.println("Nie spelniono pow. warunków");
                break;
        }

        char jedenZnak = 'a';
        switch (jedenZnak) {
            case 'a' -> System.out.println("Małe a");
            case 'A' -> System.out.println("Duże A");
            default -> System.out.println("Nic nie podąleś");
        }

        switch (zmienna) {
            case 1 -> System.out.println("jedem");
            case 2 -> System.out.println("dwa");
            case 3 -> System.out.println("trzy");
            case 5 -> System.out.println("piec");
            default -> System.out.println("Nie znam tej liczby");
        }

        System.out.println("Kalendarz");
        int month = 9;

        switch (month) {
            case 8 -> {
                System.out.println("sierpien");
                System.out.println("wrzesien");
                System.out.println("pazdziernik");
                System.out.println("listopad");
                System.out.println("grudzień");
            }
            case 9 -> {
                System.out.println("wrzesien");
                System.out.println("pazdziernik");
                System.out.println("listopad");
                System.out.println("grudzień");
            }
            case 10 -> {
                System.out.println("pazdziernik");
                System.out.println("listopad");
                System.out.println("grudzień");
            }
            case 11 -> {
                System.out.println("listopad");
                System.out.println("grudzień");
            }
            case 12 -> System.out.println("grudzień");
        }
    }

}
