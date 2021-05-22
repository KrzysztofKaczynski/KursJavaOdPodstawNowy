/**
 * Created by Krzysztof Kaczynski on 08:02 - 21.05.2021.
 */
public class MainWyjatkiTworzenie {
    public static void main(String[] args) {

        Uzytkownik uzytkownik = new Uzytkownik();

        try {
            uzytkownik.wprowadzEmail("kkacz.gmail.com");
            uzytkownik.wprowadzHaslogin("qwerty123");
            System.out.println("wszystko ok");
        } catch (NiezbytTajneHasloException e) {
            System.out.println("Hasło nezbyt bezpieczne... ");
        } catch (NiepoprawnyEmailException e ) {
            System.out.println("Email nie zawiera @");
        }
        System.out.println("program działa");
    }
}
