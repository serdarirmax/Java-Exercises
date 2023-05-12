package if_else_exercises;

import java.util.Scanner;

public class _11HesapMakinesi {
    public static void main(String[] args) {
        /*
         * Kullanicidan iki sayi girmesini isteyin. Kullaniciya dort islem menusunu
         * gosterin ve birini secmeleri isteyin.
         * Kulanicinin secimine gore girilen sayilarin islem sonucu yazdirin
         */


























        Scanner scan = new Scanner(System.in);

        System.out.println("Lutfen islem yapmak istediginiz bir sayi giriniz : ");
        double a = scan.nextDouble();

        System.out.println("Lutfen islem yapmak istediginiz diger sayiyi giriniz :");
        double b = scan.nextDouble();

        System.out.println("Lutfen dört islemden birini seciniz \n 1. Toplama \n 2. Cikarma \n 3. Carpma \n 4. Bolme");
        int secim = scan.nextInt();

        if (secim == 1 ) {
            System.out.println("girilen sayilarin toplami : " + (a + b));
        }else if ( secim ==2 ) {
            System.out.println("girilen sayilarin farki : " + (a-b));
        }else if (secim==3){
            System.out.println("girilen sayilarin carpimi : " + (a*b));

        }else if (secim==4){
            System.out.println("girilen sayilarin bolumu : " + (a/b));

        }else {
            System.out.println("yanlis giriş yaptiniz ");
        }
    }
}
