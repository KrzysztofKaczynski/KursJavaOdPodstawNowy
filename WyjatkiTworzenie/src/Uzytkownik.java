/**
 * Created by Krzysztof Kaczynski on 08:06 - 21.05.2021.
 */
public class Uzytkownik {

    public void wprowadzHaslogin(String haslo) throws NiezbytTajneHasloException {
        if (! haslo.contains("tajne")) {
            throw new NiezbytTajneHasloException();
        }
    }

    public void wprowadzEmail(String email) {
        if(! email.contains("@")) {
            throw new NiepoprawnyEmailException();
        }
    }
}
