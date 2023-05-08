package java_pratikleri;

import java.util.Scanner;

public class RakamlarinToplami01 {
    public static void main(String[] args) {
        /*
            Kullanicidan aldiginiz 3 basamakli bir sayinin rakamlari toplamini bulunuz
        ornegin => 312 icin 3+1+2=6
        */























        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen rakamlarin toplamini almak istediginiz 3 basamakli sayiyi giriniz");
        int sayi = scanner.nextInt();
        int rakamlarToplami=0;
        rakamlarToplami=rakamlarToplami+sayi%10;
        sayi=sayi/10;
        rakamlarToplami=rakamlarToplami+sayi%10;
        sayi=sayi/10;
        rakamlarToplami=rakamlarToplami+sayi%10;

        System.out.println(rakamlarToplami);

    }
}
