package acemi_exercises;

import java.util.Scanner;

public class RakamlarinOrtalamasi {
    public static void main(String[] args) {
        /*
            Kullanicidan aldiginiz 3 tane sayinin ortalamasini bulan kodu yaziniz
        ornegin => 3,5,7 icin ortalama (3+5+7)/3=5
         */






















        Scanner scanner = new Scanner(System.in);
        System.out.println("Ortalamasini almak istediginiz 3 sayidan 1.sini giriniz");
        double sayi1 = scanner.nextDouble();
        System.out.println("Ortalamasini almak istediginiz 3 sayidan 2.sini giriniz");
        double sayi2 = scanner.nextDouble();
        System.out.println("Ortalamasini almak istediginiz 3 sayidan 3.sunu giriniz");
        double sayi3 = scanner.nextDouble();
        System.out.println("Girilen sayilarin ortalamasi : "+(sayi1+sayi2+sayi3)/3);

    }
}
