package for_loop_exercises;


public class FibonacciSerisiMethod {
    /*
    Verilen sayi adedince fibonacci serisinden sayilar yazdiran bir method olusrun.
    fibonacci serisi = 0 1 1 2 3 5 8 13 21 34 .........
     */






























    public static void fibonacciSerisiGoster(int adet){
        int sayi1 = 0;
        int sayi2 = 1;
        int sayi3 = 0;
        System.out.print("0 1 ");

        for (int i = 3; i <=adet; i++) {
            sayi3=sayi1+sayi2;
            System.out.print(sayi3+" ");
            sayi1=sayi2;
            sayi2=sayi3;

        }
    }

    public static void main(String[] args) {
       fibonacciSerisiGoster(9);

    }

}
