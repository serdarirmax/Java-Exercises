package if_else_exercises;

import java.util.Scanner;

public class _01SayilariKarsilastir {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi kabul edin ve esit olup olmadiklarini kontrol eden bir program yazınız.























        Scanner scan =new Scanner(System.in);
        System.out.println("Karsilastirmak istediginiz iki sayiyi giriniz");
        float sayi1=scan.nextFloat();
        float sayi2= scan.nextFloat();

        if (sayi1 == sayi2){
            System.out.println(sayi1+" ve "+sayi2+ " birbirne esittir.");
        } else if (sayi1>sayi2) {
            System.out.println("Sayilar esit degil\n"+sayi1+", "+sayi2+" den buyuktur.");
        } else {
            System.out.println("Sayilar esit degil\n"+sayi2+", "+sayi1+"'den buyuktur.");
        }





    }
}
