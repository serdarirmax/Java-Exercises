package string_manipulations_exercises;

import java.util.Scanner;

public class AdSoyadDuzenleme {
    public static void main(String[] args) {

        //Kullanicidan ismini, soyismini ve yasini alip asagidaki formatta yazdirin.
        // girilen bilgiler : J Doe, 44



























        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen isminizi giriniz");
        String isim = scanner.nextLine().toUpperCase().substring(0,1);
        System.out.println("Lutfen soyisminizi giriniz");
        String soyisim= scanner.next().substring(0,1).toUpperCase();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scanner.nextByte();
        System.out.println("Girilen bilgiler : "+isim+" "+soyisim+", "+yas);




















    }
}
