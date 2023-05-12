package if_else_exercises;

import java.util.Scanner;

public class SayilarinBasamakDegerleri {
    public static void main(String[] args) {
        /*
       Kullanicidan uc basamakli bir sayi alin ve sayinin rakamlarini birler,onlar ve yuzler basamagi olarak yazdirin
     * Ornek : Inputs : 853
     * Output : Girdiginiz sayinin birler basamagi : 3
     *          Girdiginiz sayinin onlar basamagi : 5
     *          Girdiginiz sayinin yuzler basamagi : 8
         */
        Scanner scan =new Scanner(System.in);
        System.out.println("3 basamakli bir sayi girinz");

























        int girilensayi= scan.nextInt();
        int birlerbas=0;
        int onlarbas=0;
        int yurlerbas=0;

        if (girilensayi>999 || girilensayi<100){
            System.out.println("Yanlis giris yaptiniz! Lutfen 3 basamakli bir sayi giriniz");
        } else {
            birlerbas=girilensayi%10;
            girilensayi=girilensayi/10;
            onlarbas=girilensayi%10;
            girilensayi=girilensayi/10;
            yurlerbas=girilensayi%10;
            System.out.println("Birler Basamagi : "+birlerbas+"\nOnlar Basamagi : "+onlarbas+"\nYuzler Basamagi : "+yurlerbas);
        }


    }
}
