package switch_exercises;

import java.util.Scanner;

public class _HangiAySwitch {
		/*
		 * Kullanicidan 1-12 (dahil) bir sayi aliniz. Aldiginiz sayinin yilin hangi ayi oldugunu konsolda yazdiriniz.
            ORNEK:    INPUT: 2  ==>   OUTPUT  : Subat
		 */































    public static void main(String[] args) {
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ogrenmek istediginiz ayin sayi numarasini giriniz");
        byte ay = scanner.nextByte();
        switch (ay){
            case 1:
                System.out.println("Ocak");
                break;
            case 2:
                System.out.println("Subat");
                break;
            case 3:
                System.out.println("Mart");
                break;
            case 4:
                System.out.println("Nisan");
                break;
            case 5:
                System.out.println("Mayis");
                break;
            case 6:
                System.out.println("Haziran");
                break;
            case 7:
                System.out.println("Temmuz");
                break;
            case 8:
                System.out.println("Agustos");
                break;
            case 9:
                System.out.println("Eylul");
                break;
            case 10:
                System.out.println("Ekim");
                break;
            case 11:
                System.out.println("Kasim");
                break;
            case 12:
                System.out.println("Aralık");
                break;
            default:
                System.out.println("Boyle bir ay nosu yok, tekrar deneyiniz");

        }




    }
}
