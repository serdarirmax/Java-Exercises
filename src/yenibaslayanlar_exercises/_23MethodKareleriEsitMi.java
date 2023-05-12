package yenibaslayanlar_exercises;

import java.util.Scanner;

public class _23MethodKareleriEsitMi {
    public static void main(String[] args) {
        //kullanicidan aldiginiz 2 sayinin karelerinin birbirine esit olup olmadigini kontrol eden bir method yaziniz
        //yani alinan iki sayinin kareleri esit ise true, degil ise false yazdirin.


















        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen 1. sayiyi giriniz");
        int sayi1 = input.nextInt();
        System.out.println("Lutfen 2. sayiyi giriniz");
        int sayi2 = input.nextInt();

        kareleriEsitMi(sayi1, sayi2);


    }

    public static boolean kareleriEsitMi(int sayi1, int sayi2) {

        boolean esitMi = sayi1*sayi1==sayi2*sayi2;
        System.out.println(esitMi);
        return esitMi;

    }
}
