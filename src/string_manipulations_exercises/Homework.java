package string_manipulations_exercises;

import java.util.Scanner;

public class Homework {
    public static void main(String[] args) {
        // 5 Calisma bir arada

        //odev 1: Bir string variable olusturunuz ve bu string deki rakam olmayan tum karakterlerin
        // sayisini console a yazdiriniz

















        String s = "Besiktas1903";
        System.out.println(s.replaceAll("[0-9]", "").length());





        //odev 2: Bir string variable olusturunuz ve ilk karakter ile son karakter disindaki tum karakterleri
        // console a buyuk harflerle yazdiriniz





















        String z = "BESIKTAS";
        System.out.println(z.substring(0,1).toLowerCase()+z.substring(1,z.length()-1).toUpperCase()+z.substring(z.length()-1).toLowerCase());





        //odev3: Bir string variable olusturunuz ve bu string deki ilk ve son karakterlerin
        // ASCII degerleri toplamini console a yazdiriniz




























        String b = "La finestra di fronte";
        char ilkchar = b.charAt(0);
        char sonchar = b.charAt(b.length()-1);
        System.out.println(ilkchar+sonchar);






        //odev4: Tek kelimeli bir sehir ismi icin string variable olusturun ve sehir isiminin
        // ilk harfini buyuk harfle diger harflerini kucuk harflerle console a yazdirin




















        String city = "edirne";
        System.out.println(city.substring(0,1).toUpperCase()+city.substring(1).toLowerCase());









        /*
        odev5: Asagidaki kurallara gore kullanicinin girdigi password u kontrol ediniz
        a)En az 6 character olsun
        b)En az bir tane buyuk harf olsun
        c)En az bir tane kucuk harf olsun
        d)En az bir tane rakam olsun
        */























        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sifrenizi giriniz");
        String password = input.next();
        boolean basamak1 = password.length()>5;
        boolean basamak2 = password.replaceAll("[^A-Z]","").length()>0;
        boolean basamak3 = password.replaceAll("[^a-z]","").length()>0;
        boolean basamak4 = password.replaceAll("[^0-9]","").length()>0;
        if (basamak1&&basamak2&&basamak3&&basamak4){
            System.out.println("Giris basarili.");
        }











    }
}
