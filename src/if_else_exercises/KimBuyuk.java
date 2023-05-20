package if_else_exercises;
import java.util.Scanner;
public class KimBuyuk {
    //     Kullanicidan 2 kişinin dogum tarihlerini ayri ayri (gun-ay-yil) alarak kiyaslayan ve yas olarak buyuk olani
    //  konsola yazdiran kodu yaziniz.
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);




























        System.out.println("1. Sahsin dogum gununuzu giriniz");
        int aDogumGunu = scan.nextInt();
        System.out.println("1. Sahsin dogum ayinizi giriniz");
        int aDogumAyi = scan.nextInt();
        System.out.println("1. Sahsin dogum yilinizi giriniz");
        int aDogumYili = scan.nextInt();


        System.out.println("2. Sahsin dogum gununuzu giriniz");
        int bDogumGunu = scan.nextInt();
        System.out.println("2. Sahsin dogum ayinizi giriniz");
        int bDogumAyi = scan.nextInt();
        System.out.println("2. Sahsin dogum yilinizi giriniz");
        int bDogumYili = scan.nextInt();

        if (aDogumYili > bDogumYili) {
            System.out.println(" 2. Sahis daha buyuk");
        } else if (bDogumYili > aDogumYili) {
            System.out.println(" 1. Sahis daha buyuk");
        } else {
            if (aDogumAyi > bDogumAyi) {
                System.out.println(" 2. Sahis daha buyuk");
            } else if (bDogumAyi > aDogumAyi) {
                System.out.println(" 1. Sahis daha buyuk");
            } else {
                if (aDogumGunu > bDogumGunu) {
                    System.out.println("2. Sahis daha buyuk");
                } else if (bDogumGunu > aDogumGunu) {
                    System.out.println("1. Sahis daha buyuk");
                } else {
                    System.out.println("Yasitsiniz");
                }
            }


        }


    }
}
