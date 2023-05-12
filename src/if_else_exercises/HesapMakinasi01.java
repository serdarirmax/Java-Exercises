package if_else_exercises;

import java.util.Scanner;

public class HesapMakinasi01 {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi aliniz ==> 6     2
        // yapmak istedigi işlem isaretini girmesini siteyiniz  ==> + - * /
        // islemi yaparak sonucu konsolda gosteren programi if / else kullanarak yaziniz.

























        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("yapmak istediginiz islem isaretini giriniz");
        char sembol = scan.next().charAt(0);

        if (sembol=='+'){
            System.out.println(sayi1+sayi2);
        } else if (sembol=='-') {
            if (sayi1>sayi2){
                System.out.println(sayi1-sayi2);
            }else if (sayi2>sayi1){
                System.out.println(sayi2-sayi1);
            }
        } else if (sembol=='*') {
            System.out.println(sayi1*sayi2);
        } else if (sembol=='/') {
            if (sayi1>sayi2){
                System.out.println(sayi1/sayi2);
            }else if (sayi2>sayi1){
                System.out.println(sayi2/sayi1);
            }
        } else {
            System.out.println("islem hatasi");
        }






    }



}
