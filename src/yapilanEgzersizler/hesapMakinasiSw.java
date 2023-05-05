package yapilanEgzersizler;

import java.util.Scanner;

public class hesapMakinasiSw {
    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("yapmak istediginiz iþlem isaretini giriniz");
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
                System.out.println("islem hasati");
            }


        }



    }



}


