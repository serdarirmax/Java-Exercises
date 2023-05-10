package yapilanegzersizler;

import java.util.Scanner;

// ZOR SORU: Kullan�c�dan 2 basamakl� bir say� al�p, girilen say�y� yaz� �le yazd�r�n.

public class mevsimlerSwitch_zorSoruBurada {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Yilin kac�nc� ayindayiz (1,...,12)");
        int a = scan.nextInt();
        switch (a) {
            case 12:
            case 1:
            case 2:{
                System.out.println("Kis Mevsimi");
            }
            break;
            case 3:
            case 4:
            case 5: {
                System.out.println("Ilkbahar Mevsimi");
            }
            break;
            case 6:
            case 7:
            case 8: {
                System.out.println("Yaz Mevsimi");
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Sonbahar Mevsimi");
            }
            default: {
                System.out.println("yanlis bir rakam girdiniz");
            }
        }


    }
}
