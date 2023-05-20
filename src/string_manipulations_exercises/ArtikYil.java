package string_manipulations_exercises;

import java.time.LocalDate;

public class ArtikYil {
    public static void main(String[] args) {
        /*      Belirli bir yilin "Artik yil" olup olmadiğini kontrol etmek icin kodu yaziniz.
            Artik Yil:
                Bir yil 100'e ve 400'e tam bolunuyorsa buna artik yil denir. Ornegin; 2000 artik yil, 1900 degildir.
                Bir yil 100'e tam bolunemiyor ve 4'e tam bolunuyorsa artik yil olarak adlandirilir.
                Ornegin; 2004 artik yil, 2007 degildir.
        */






























        // 1. YOL
        LocalDate tarih = LocalDate.of(1900,05,20);
        boolean artikYilMi = tarih.isLeapYear();
        System.out.println(tarih+" Artik yil mi :"+artikYilMi);

        // 2. YOL
        int year = 1900;
        boolean adim1 = year % 100 == 0 && year % 400 == 0;
        boolean adim2 = year % 100 != 0 && year % 4 == 0;
        System.out.println(adim1||adim2  ? "Artik yildir." : "Artik yil degildir.");


    }
}
