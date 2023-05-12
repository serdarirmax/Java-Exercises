package if_else_exercises;
import java.util.Scanner;
public class PozitifMiNegatifMi {

    // Kullanici tarafindan girilen sayinin pozitif veya negatif oldugunu konsola yazdirin
    // Ya girilen sayi sifirsa ne yaparsin?

    public static void main(String[] args) {
       Scanner scan = new Scanner(System.in);























       System.out.println("bir double bir sayi giriniz :");
       double sayi = scan.nextDouble();

       if (sayi>0){
           System.out.println(sayi+" Pozitif bir sayidir");
       } else if (sayi<0) {
           System.out.println(sayi+" Negatif bir sayidir");
       } else {
           System.out.println(sayi+" Notr bir sayidir");
       }

    }
}
