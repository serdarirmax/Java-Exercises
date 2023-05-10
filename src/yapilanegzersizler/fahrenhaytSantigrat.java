package yapilanegzersizler;

import java.util.Scanner;

public class fahrenhaytSantigrat {
    /*
        Sıcaklığı Fahrenhayt'tan Santigrat derecesine çeviren bir Java programı yazın.
         formül
        c = (f-32)*5/9
     */

    public static void main(String[] args) {

        System.out.println("Sicaklik birimini fahrenhayt olarak giriniz : ");
        double fahren = new Scanner(System.in).nextDouble();
        double santigrat = (fahren-32)*5/9;


        System.out.println(fahren + "F degeri " + santigrat + "C'a esittir.");

    }

}
