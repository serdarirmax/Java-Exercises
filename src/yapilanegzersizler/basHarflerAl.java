package yapilanegzersizler;

import java.util.Scanner;

public class basHarflerAl {
    public static void main(String[] args) {

       // Verilen bir ismin ad�n�n ve soyad�n�n ba� harflerini almak i�in kodu yaz�n�z.
       // Not: �kinci isim kapsam d���ndad�r.
       // �rnek: Tom Hanks ==> TH, Mary Star ==> MS

        String input = "Tom Hanks";

        System.out.println(input.substring(0, 1)+input.substring(4,5));

        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen bir isim giriniz");
        String isim= scan.nextLine();

        System.out.println(isim.charAt(0));
        int index = isim.indexOf(" ");
        int soyisimindx=(index+1);
        System.out.println(isim.substring(0, 1)+isim.charAt(soyisimindx));
    }
}
