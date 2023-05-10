package yapilanegzersizler;

import java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();

        System.out.println("Lutfen agirliginizi kg. olarak giriniz");
        double kilo= scan.nextDouble();
        // V�cut kitle indeksi, v�cut a��rl���n�n boy uzunlu�unun karesine b�l�nmesiyle (gr./cm) hesaplan�r.
        double vke = kilo*10000/(boy*boy);
        System.out.println(vke);
        if (vke>30){
            System.out.println("Obezsiniz");
        } else if (vke>=25) {
            System.out.println("Kilolusunuz");
        } else if (vke>=20){
            System.out.println("Ideal kilodas�n�z");
        } else if (vke<20){
            System.out.println("Zayifsiniz");
        }


    }
}
