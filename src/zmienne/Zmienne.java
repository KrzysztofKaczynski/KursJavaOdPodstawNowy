package zmienne;

public class Zmienne {
    public static void main(String[] args) {

        int liczbaOkien = 30;

        System.out.println(Byte.MIN_VALUE + " " + Byte.MAX_VALUE);
        System.out.println(Short.MIN_VALUE + " " + Short.MAX_VALUE);
        System.out.println(Integer.MIN_VALUE + " " + Integer.MAX_VALUE);

         long zmiennaLong = 1000000000000L;
         System.out.println(Long.MIN_VALUE + " " + Long.MAX_VALUE);

         float zmiennaFloat = 12.34f;
        System.out.println("Float: " + zmiennaFloat);

        double zmiennaDouble = 12.3412345555555;
        System.out.println("Double: " + zmiennaDouble);

        // Pojedyncze znaki
        char zmiennaChar = 'A';
        System.out.println("Char: " + zmiennaChar);

        boolean zmiennaBoolean = true;
        System.out.println("Boolean: " + zmiennaBoolean);

    }
}
