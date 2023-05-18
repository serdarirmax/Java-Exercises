package interwiew_exercises;
import java.util.Scanner;
public class IsmiKisalt {
    public static void main(String[] args) {
        //  Kullanıcıdan alacağınız, 3 kelimeden oluşan ismi
        //  Örn. Ahmet Emin Yılmaz -> A.E.Y.  formatıyla yazdırınız.
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen adinizi giriniz");





















        String name = input.nextLine();
        String onAd = name.split(" ")[0];
        String ad = name.split(" ")[1];
        String soyad = name.split(" ")[2];
        char kr1 = onAd.charAt(0);
        char kr2 = ad.charAt(0);
        char kr3 = soyad.charAt(0);
        System.out.println(""+kr1+"."+kr2+"."+kr3+".");


    }
}
