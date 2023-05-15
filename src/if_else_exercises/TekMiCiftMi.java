package if_else_exercises;

import java.util.Scanner;

public class TekMiCiftMi {
    public static void main(String[] args) {
        //Ornek : Kullanicidan  alinan bir sayinin tek mi cift mi oldugunu yazdiran kodu olusturunuz

        Scanner input = new Scanner(System.in);
        int sayi = input.nextInt();
























        if (sayi%2==0){
            System.out.println("Cift sayi");
        }
        if (sayi%2!=0){
            System.out.println("Tek sayi");
        }
    }
}
