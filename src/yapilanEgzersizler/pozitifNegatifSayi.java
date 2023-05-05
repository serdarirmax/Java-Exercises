package yapilanEgzersizler;

import java.util.Scanner;

public class pozitifNegatifSayi {
    // Question using Scanner, could you find a double number positive or negative ?
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
