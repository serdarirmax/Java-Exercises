package for_loop_exercises;

import java.util.Scanner;

public class GirilenSayiOrt {
    /*  Giris yapilan sayi sifir olmadıkca toplama islemi yapan
        sifir girisi ile toplanan sayilarin ortalamasini alan programi yaziniz.

        double num1 = 23.4;
        double num2 = 24.0;
        double num3 = 12;
        double num4 = 450.3;
        double num5 = 23000;
        bu double sayilarin ortalamasini bulunuz
     */

    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);























        double girilensayi=9999;
        double toplam =0;
        int sayac=0;

        while (girilensayi!=0){

            System.out.println("Lutfen bir sayi giriniz");
            girilensayi=scan.nextDouble();
            toplam+=girilensayi;
            sayac++;
        }
        System.out.println(toplam/sayac);

    }
}
