package switch_exercises;
import java.util.Scanner;
public class SayininOkunusu {
    public static void main(String[] args) {
        // Kullanicidan uc basamakli bir sayi sisteme girmesini isteyiniz
        // Bu sayiyi okunusuna ceviren bir kod yaziniz.
        Scanner scan = new Scanner(System.in);





























        System.out.println("Lutfen 3 basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        int birlerBasamagi = sayi % 10;
        int onlarBasamagi = (sayi / 10) % 10;
        int yuzlerBasamagi = sayi / 100;
        String yuzluk ="";
        String onluk = "";
        String birlik ="";
        if (sayi > 999 || sayi < 100) {
            System.out.println("Girilen sayi 3 basakli degil, kontrol edip tekrar deneyiniz.");
        } else {

            switch (yuzlerBasamagi) {
                case 1:
                    yuzluk="Yuz";
                    break;
                case 2:
                    yuzluk="Ikiyuz";
                    break;
                case 3:
                    yuzluk="Ucyuz";
                    break;
                case 4:
                    yuzluk="Dortyuz";
                    break;
                case 5:
                    yuzluk="Besyuz";
                    break;
                case 6:
                    yuzluk="Altiyuz";
                    break;
                case 7:
                    yuzluk="Yediyuz";
                    break;
                case 8:
                    yuzluk="Sekizyuz";
                    break;
                case 9:
                    yuzluk="Dokuzyuz";
                    break;
            }
            switch (onlarBasamagi) {
                case 1:
                    onluk="on";
                    break;
                case 2:
                    onluk="yirmi";
                    break;
                case 3:
                    onluk="otuz";
                    break;
                case 4:
                    onluk="kirk";
                    break;
                case 5:
                    onluk="elli";
                    break;
                case 6:
                    onluk="altmis";
                    break;
                case 7:
                    onluk="yetmis";
                    break;
                case 8:
                    onluk="seksen";
                    break;
                case 9:
                    onluk="doksan";
                    break;
            }
            switch (birlerBasamagi) {
                case 1:
                    birlik="bir";
                    break;
                case 2:
                    birlik="iki";
                    break;
                case 3:
                    birlik="uc";
                    break;
                case 4:
                    birlik="dort";
                    break;
                case 5:
                    birlik="bes";
                    break;
                case 6:
                    birlik="alti";
                    break;
                case 7:
                    birlik="yedi";
                    break;
                case 8:
                    birlik="sekiz";
                    break;
                case 9:
                    birlik="dokuz";
                    break;
            }

        }

        System.out.println(yuzluk+" "+onluk+" "+birlik+".");
    }
}
