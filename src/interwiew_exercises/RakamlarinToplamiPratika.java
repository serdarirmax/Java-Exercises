package interwiew_exercises;

import java.util.Scanner;

public class RakamlarinToplamiPratika {
    public static void main(String[] args) {
        //Bir tamsayinin rakamlarinin toplamini yazan kodu olusturunuz
            Scanner scanner = new Scanner(System.in);
            System.out.print("Bir sayi giriniz...");
            int sayi = scanner.nextInt();
            int rakamlarToplami = 0;

            for (int i = sayi; i > 0; i = i / 10) {
                rakamlarToplami=rakamlarToplami+i%10;
            }
            System.out.println(rakamlarToplami);

    }
}
