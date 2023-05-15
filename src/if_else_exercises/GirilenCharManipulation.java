package if_else_exercises;

import java.util.Scanner;

public class GirilenCharManipulation {
    public static void main(String[] args) {
        // Kullanicidan bir harf isteyin, girilen karakter kucuk harf ise
        // onu buyuk harf olarak yazdirin, yoksa girilen harfi yazdirin

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir karakter giriniz.");

















        String input2 = input.next();
        boolean b = input2.substring(0,1).replaceAll("[a-z]","_").contains("_");
        if (b){
            System.out.println(input2.substring(0,1).toUpperCase()+input2.substring(1));
        } else {
            System.out.println(input2);
        }
    }
}
