package if_else_exercises;

import java.util.Scanner;

public class stringUzunluk {

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
        System.out.println("lutfen 1. sayiyi giriniz");
        int sayi1 = scan.nextInt();
        System.out.println("lutfen 2. sayiyi giriniz");
        int sayi2 = scan.nextInt();
        System.out.println("yapmak istediginiz işlem isaretini giriniz");
        String sembol = scan.next();

        if (sembol.charAt(0)=='+'){
            System.out.println(sayi1+sayi2);
        } else if (sembol.charAt(0)=='-') {
            if (sayi1>sayi2){
                System.out.println(sayi1-sayi2);
            }else if (sayi2>sayi1){
                System.out.println(sayi2-sayi1);
            }
        } else if (sembol.charAt(0)=='*') {
            System.out.println(sayi1*sayi2);
        } else if (sembol.charAt(0)=='/') {
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
