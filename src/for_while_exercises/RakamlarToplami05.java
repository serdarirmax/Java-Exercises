package for_while_exercises;

import java.util.Scanner;

public class RakamlarToplami05 {
    public static void main(String[] args) {
        // 4 basakli rakamin basamak sayilarini toplayan bir program yaziniz
        // bu okeyse birde programi interaktif hale getir bakalim Kaç basamak yazarsa yazsin yinede toplamini versin??

        Scanner scan = new Scanner(System.in);
        System.out.println("4 basamakli bir rakam yazarmisin?");




















        int sayi=scan.nextInt();
        int rakamlartoplami=0;
        int birlerbasamagi=0;

        for (int i = 1; i <=4; i++) {
            birlerbasamagi=sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlartoplami);



    }
}
