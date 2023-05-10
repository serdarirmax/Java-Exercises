package gozdengecir.practice02;

import java.util.Scanner;

public class Q_19 {
    /*
     *Kullanici tarafindan girilen bir sayinin
     *mutlak degerini yazdirmak icin bir program yazin.
     */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("mutlak değer bulmka için bir sayı giriniz :");
        int i = scan.nextInt();

        if (i >= 0){
            System.out.println("girilen sayının mutlak değeri :" + i);

        }else{
            System.out.println("girilen sayının mutlak değeri : " + (i*-1));
        }
        scan.close();
    }
}
