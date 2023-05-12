package yenibaslayanlar_exercises;

import java.util.Scanner;

public class _16_ScannerOrnek03 {
    public static void main(String[] args) {

        /*
     * Kullanicidan 3 kelime isteyin ve cumle olarak yazdirip sonuna . koyun
     * Ornek : Inputs : Ali, topu, tut
     *         Output : Ali topu tut.
     */

























        Scanner scan = new Scanner(System.in);

        System.out.println("Lütfen cümle oluşturmak için bir kelşme giriniz: ");
        String kelime1 = scan.next();

        System.out.println("Lütfen cümle oluşturmak için bir kelşme giriniz: ");
        String kelime2 = scan.next();

        System.out.println("Lütfen cümle oluşturmak için bir kelşme giriniz: ");
        String kelime3 = scan.next();

        System.out.println(kelime1+" " + kelime2 + " " + kelime3 + ".");



    }

}
