/**
 * Created by Krzysztof Kaczynski on 08:57 - 24.04.2021.
 */
public class Zad7 {
    public static void main(String[] args) {
        /*
        Napisz program, w którym po podaniu liczby n narysujesz
         za pomocą * (gwiazdki) trójkąt prostokątny o przyprostokątnych składających się z n-razy * (gwiazdki) ;)
        np. podając n = 5 powinniśmy otrzymać taki trójkąt:
        *
        **
        ***
        ****
        *****
         */

        int n = 5;
        int liczbaGwiazdek = 1;
        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= liczbaGwiazdek; j++) {
                System.out.print("*");

            }
            System.out.println();
            liczbaGwiazdek++;
        }
        System.out.println("Zadanie 8");
       // int liczbaGwiazdekLustrzanych = 1;
       // int liczbaSpacjiLustrzanych = n - 1;

        for(int i = 1; i <= n; i++) {
            for (int j = 1; j <= n - 1; j++) {
                System.out.print("");
            }
            for(int j = 1; j <= i; j++) {
                System.out.print("*");
            }
            System.out.println();
            //liczbaSpacjiLustrzanych--;
           // liczbaGwiazdekLustrzanych++;
        }

    }
}
