package yenibaslayanlaricin;

import java.util.Scanner;

public class _28OgrenciNotHesap {
    public static void main(String[] args) {
        /*
	 * Kullanicidan ara notu, final notunu ve proje notunu girmesini isteyin
       Genel notu hesaplayin (ara sinav:% 30, proje:% 20, final:% 50)
	 */



















        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen ara sinav notunuzu giriniz : ");
        double araSnv = scanner.nextDouble();

        System.out.println("lutfen final sinav notunuzu giriniz : ");
        double finalSnv= scanner.nextDouble();

        System.out.println("lutfen proje notunuzu giriniz : ");
        double proje = scanner.nextDouble();

        double genelNot = (araSnv*0.3) + (proje*0.2) + (finalSnv*0.5);

        System.out.println("Genel Not : " + genelNot );




    }
}
