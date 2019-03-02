package Alg2;

public class liczbyDoskonałe {

    public static String wyszukajLiczbeDoskonala(int liczba) {
        String result = "";
        if (sprawdzLiczbe(liczba)) {
            result = "Tak, to jest liczba doskonała";
        } else {
            result = "Nie jest to liczba doskonała";
        }
        return result;

    }

    private static boolean sprawdzLiczbe(int liczba) {
        int suma = 0;
        for (int i = 1; i < liczba; i++) {
            if (liczba % i == 0)
                suma += i;
        }
        if (suma == liczba) {
            return true;
        } else {
            return false;
        }


    }
}