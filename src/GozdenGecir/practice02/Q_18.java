package GozdenGecir.practice02;

import java.util.Scanner;

public class Q_18 {
    /*
     *
     * Kullanicidan 3 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     *
     * Ornek : Inputs : Ali, topu, tut
     *         Output : Ali topu tut.
     *
     *
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen cümle oluşturmak için bir kelşme giriniz: ");
        String kelime1 = scan.next();

        System.out.println("Lütfen cümle oluşturmak için bir kelşme giriniz: ");
        String kelime2 = scan.next();

        System.out.println("Lütfen cümle oluşturmak için bir kelşme giriniz: ");
        String kelime3 = scan.next();

        System.out.println(kelime1+" " + kelime2 + " " + kelime3 + ".");
        scan.close();

       //  5  kg elma almak istiyorum


    }

}
