package switch_exercises;

import java.util.Scanner;

public class HesapMakinasi02 {
    // Kullanicidan 2 sayi aliniz ==> 6     2
    // yapmak istedigi işlem isaretini girmesini siteyiniz  ==> + - * /
    // islemi yaparak sonucu konsolda gosteren programi yaziniz.


    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);


























        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("yapmak istediginiz islem isaretini giriniz");
        char chr = scan.next().charAt(0);
        switch (chr){
            case '+':
                System.out.println(sayi2+sayi1);
                break;
            case '-':
                System.out.println(sayi2-sayi1);
                break;
            case '*':
                System.out.println(sayi2*sayi1);
                break;
            case '/':
                System.out.println(sayi2/sayi1);
                break;
            default:{
                System.out.println("islem hatasi");
            }


        }



    }



}


