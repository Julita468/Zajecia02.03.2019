package Alg2;

import java.util.Scanner;

public class myHelper {


    public static int pobierzLiczbe() {
        int result;
        Scanner scaner = new Scanner(System.in);
        return scaner.nextInt();
    }

    public static int pobierzLiczbe(String message) {
        System.out.println(message);
        Scanner scaner = new Scanner(System.in);
        return scaner.nextInt();
    }
    public static void wyswietl (String message) {
        System.out.println(message);
    }
}
