package Interwiew_Sorulari;

import java.time.LocalDate;

public class Deneme11111 {
    public static void main(String[] args) {
        LocalDate tarih = LocalDate.of(1980,04,25);
        boolean artikYilMi = tarih.isLeapYear();
        System.out.println("artikYilMi = " + artikYilMi);

        int sayi = 2004;
       String artikYil= (sayi%100==0 && sayi%400==0)|| (sayi%100!=0 && sayi%4!=0)  ? sayi+" artik yildir." : sayi + " artik yil degildir.";
        System.out.println("artikYil = " + artikYil);

    }
}
