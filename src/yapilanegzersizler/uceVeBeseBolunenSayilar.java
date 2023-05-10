package yapilanegzersizler;

import java.util.Scanner;

public class uceVeBeseBolunenSayilar {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir tamsayi giriniz");
        int tamsayi = scan.nextInt();

        if (tamsayi%5==0 && tamsayi%3==0){                     //burayı önce olarak koymaz isek görmüyor.
            System.out.println("super sayi");
        } else if (tamsayi%5==0) {
            System.out.println("bes ile bolunebilen bir tam sayi");
        } else if (tamsayi%3==0) {
            System.out.println("uc ile bolunebilen bir tam sayi");
        } else {
            System.out.println("Malesef bu sayi 3e veya 5e tam bolunmuyor");
        }


    }
}
