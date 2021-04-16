package instrukcje_warunkowe;

public class InstrukcjeWarunkowe {
    public static void main(String[] args) {

        int wiek = 9;


        if (wiek >= 10) {
            System.out.println("Warunek został spełniony");
        } else if (wiek == 9) {
            System.out.println("Ma 9 lat");
        }else {
            System.out.println("Ma mniej niż 9 lat");
        }
    }
}