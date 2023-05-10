package yapilanegzersizler;

import java.util.Scanner;

public class rakamlarToplami {
    public static void main(String[] args) {


        Scanner scan = new Scanner(System.in);
        System.out.println("rakam ver bana");
        int sayi=scan.nextInt();
        int rakamlartoplami=0;
        int birlerbasamagi=0;

        for (int i = 1; i <=4; i++) {
            birlerbasamagi=sayi%10;
            rakamlartoplami=rakamlartoplami+birlerbasamagi;
            sayi=sayi/10;
        }
        System.out.println(rakamlartoplami);

        System.out.println(" ");





    }
}
