package ternary_exercises;
public class ArtikYil {
    public static void main(String[] args) {
        /*
        Nested Ternary kullanarak verilen degerin atrik yil olup olmadigini bulan kod yaziniz.
        Bir yılın artık yıl olup olmadığını kontrol eden bir program yazınız.
        Yıl 100'e tam bölünüyorsa 400'e tam bölünmelidir.
        Bir yıl 100'e tam bölünemiyorsa 4'e tam bölünmelidir.
         */

        int year = 2008;




































        System.out.println(year%100==0 ? (year%400==0 ? "Leap" : "Not leap") : (year%4==0 ? "Leap" : "Not leap"));
    }
}
