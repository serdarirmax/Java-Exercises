package yapilanEgzersizler;

import java.util.Scanner;

public class asalMi {
    public static void main(String[] args) {

        Scanner scan=new Scanner(System.in);
        System.out.println("Lutfen bir sayigiriniz");
        int sayi = scan.nextInt();
        boolean bayrak = false;
        for (int i = 2; i < sayi; i++) {
            if (sayi%i==0){
                bayrak=true;
            }
        }
        if (bayrak==true){
            System.out.println("Asal sayidir.");
        } else {
            System.out.println("Asal sayi degildir.");
        }

    }
}
