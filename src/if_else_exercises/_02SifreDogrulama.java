package if_else_exercises;

import java.util.Scanner;

public class _02SifreDogrulama {
    public static void main(String[] args) {
        // Kullanicidan bir sifre girmesin isteyin
        // Girilen sifre "JavaLearner" ise mail onaylandi
        // Yanlis ise tekrar deneyiniz uyarısı veriniz




















        Scanner scan = new Scanner(System.in);
        System.out.println("Sifre giriniz");

        String sifre = scan.next();

        if(sifre.equals("JavaLearner")) {
            System.out.println("Sifre dogru, Hosgeldiniz.");
        }else{
            System.out.println("Girilen sifre yanlistir, lutfen tekrar deneyin.");
        }














    }
}
