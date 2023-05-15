package if_else_exercises;

import java.util.Scanner;

public class BuyukHarfMiKucukMu {
    public static void main(String[] args) {
        //Ornek : Kullanicinin vermis oldugu character buyuk harf ise ekrana "Buyuk Harf",
        // kucuk harf ise ekrana "Kucuk Harf" yazdiran kodu olusturunuz

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz");


























        char ch = scan.next().charAt(0);
        if (ch>='A'&&ch<='Z'){
            System.out.println("Buyuk harftir.");
        } else if (ch>='a'&&ch<='z') {
            System.out.println("Kucuk harftir.");
        } else {
            System.out.println("Harf degildir.");
        }
    }
}
