package yapilanEgzersizler;

import java.util.Scanner;

public class EldekiCalisma {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen mail adresinizi giriniz");
        String input =scan.nextLine();

        if (!input.contains("@")){
            System.out.println("gecersiz mail adresi");
        } else if (!input.contains("@gmail.com")) {
            System.out.println("mail gmail olmali");
        } else if (!input.endsWith("@gmail.com")) {
            System.out.println("mailde yazim hatasi var");
        } else if (input.startsWith("@gmail.com")) {
            System.out.println("Eksik giriþ yaptiniz");
        } else {
            System.out.println("Sisteme giris yapildi");
        }
    }
}
