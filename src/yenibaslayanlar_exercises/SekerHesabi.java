package yenibaslayanlar_exercises;

import java.util.Scanner;

public class SekerHesabi {
    /*
       Kullaniciya gunde kac cay ictigini ve kac seker kullandigini sorun.
     * Bir yilda kac kg seker kullandigini hesaplayip yazdirin
     * 1 seker = 1.7 gr
     * Ornek : Input : cay sayisi : 10 seker sayisi :2
     *         Output : Yilda 12.41 kg seker kullaniyorsunuz
       */
    public static void main(String[] args) {

























        int toplamcay=0;
        double toplamseker=0;
        Scanner scan =new Scanner(System.in);
        System.out.println("Bir gunde kac adet cay iciyorsunuz");
        int caysayisi=scan.nextInt();
        System.out.println("Bir cayda kullandiginiz seker miktari nedir (kup seker/Adet)");
        double sekeradet= scan.nextInt();
        int toplamcaylt = 0;
        toplamcay=caysayisi*365;
        toplamseker=(toplamcay*1.7*sekeradet)/1000;
        toplamcaylt = toplamcay*125/1000;
        System.out.println("Yilda icilen cay miktari (Lt) : "+toplamcaylt+"\nYilda kullanilan seker miktari (kg) : "+toplamseker);


    }
}
