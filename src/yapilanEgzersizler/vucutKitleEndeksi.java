package yapilanEgzersizler;

import java.util.Scanner;

public class vucutKitleEndeksi {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen boyunuzu cm olarak giriniz");
        double boy= scan.nextDouble();

        System.out.println("Lutfen agirliginizi kg. olarak giriniz");
        double kilo= scan.nextDouble();
        // Vücut kitle indeksi, vücut aðýrlýðýnýn boy uzunluðunun karesine bölünmesiyle (gr./cm) hesaplanýr.
        double vke = kilo*10000/(boy*boy);
        System.out.println(vke);
        if (vke>30){
            System.out.println("Obezsiniz");
        } else if (vke>=25) {
            System.out.println("Kilolusunuz");
        } else if (vke>=20){
            System.out.println("Ideal kilodasýnýz");
        } else if (vke<20){
            System.out.println("Zayifsiniz");
        }


    }
}
