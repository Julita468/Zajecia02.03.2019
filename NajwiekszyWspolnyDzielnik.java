package Alg1;

public class NajwiekszyWspolnyDzielnik {
    //algorytm Euklidesa

    public static void main(String[] args) {
        Integer nwd1 = nwd1(14, 28);
        System.out.println(nwd1);
    }

    public static Integer nwd1(Integer a, Integer b) {
        while (a != b) {
            if (a > b) {
                a = a - b;
            }
            else {
                b = b - a;
            }
        }
        return a;

    }

    public static int moja_funkcja (int pierwsza, int druga) {
        if (druga == 0) {
            return pierwsza;
        }
        else {
            return moja_funkcja(druga, pierwsza/druga);
        }

    }

}
