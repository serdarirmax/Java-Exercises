package GG.practice02;

import java.util.Scanner;

public class Q_17 {
    /*
     * Kullanicidan iki sayi girmesini isteyin. Kullaniciya dort islem menusunu
     * gosterin ve birini secmeleri isteyin.
     * Kulanicinin secimine gore girilen sayilarin islem sonucu yazdirin
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen işlem yapmak istediğiniz bir sayı giriniz : ");
        double a = scan.nextDouble();

        System.out.println("Lütefen işlem yapmak istediğiniz diğer sayıyı giriniz :");
        double b = scan.nextDouble();

        System.out.println("Lütfen dört işlmeden birini seçiniz \n 1. Toplama \n 2. Çıkarma \n 3. Çarpma \n 4. Bölme");
        int secim = scan.nextInt();

        if (secim == 1 ) {
            System.out.println("girilen sayıların tolplamı : " + (a + b));
        }else if ( secim ==2 ) {
            System.out.println("girilen sayıların farkı : " + (a-b));
        }else if (secim==3){
            System.out.println("girilen sayıların çarpımı : " + (a*b));

        }else if (secim==4){
            System.out.println("girilen sayıların bolümü : " + (a/b));

        }else {
            System.out.println("yanlış giriş yaptınız ");
        }
        scan.close();
    }
}
