package GozdenGecir.practice02;

import java.util.Scanner;

public class Q_15 {
    /*
	 * Kullanicidan ara notu, final notunu ve proje notunu girmesini isteyin
       Genel notu hesaplayin (ara sinav:% 30, proje:% 20, final:% 50)
	 */

    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("lütfen ara sınav notunuzu giriniz : ");
        double araSnv = scanner.nextDouble();

        System.out.println("lütfen final sınav notunuzu giriniz : ");
        double finalSnv= scanner.nextDouble();

        System.out.println("lütfen proje notunuzu giriniz : ");
        double proje = scanner.nextDouble();

        double genelNot = (araSnv*0.3) + (proje*0.2) + (finalSnv*0.5);

        System.out.println("Genel Not : " + genelNot );

        scanner.close();




    }
}
