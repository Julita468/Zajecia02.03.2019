package Alg1;

public class ciagFibonacciego {

    //rekurencja

    public static void main(String[] args) {
        System.out.println(Fibon(7));
        System.out.println(mojFibonacci(100));
    }

    public static int Fibon(int n) {
        if ((n == 1) || (n == 2))
            return 1;
        else
            return Fibon(n - 1) + Fibon(n - 2);
    }


    public static int mojFibonacci(int n) {
        int a = 0;
        int b = 1;
        int result = 0;
       /*  while (n != 0) {
            result = a + b;
            b = a;
            a = result;
            n--;
           */

        for (int i = 0; i < i; i++) {
            result = a + b;
            b = a;
            a = result;
        }
        return result;


    }

}
