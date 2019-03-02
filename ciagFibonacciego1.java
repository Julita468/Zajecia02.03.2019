package Alg1;

public class ciagFibonacciego1 {

        public static void main(String[] args) {
            int x=0;
            int y=1;
            int suma=0;
            while(x<500){
                suma=x + y;
                y=x;
                x=suma;
                System.out.println(suma);
            }
        }
    }