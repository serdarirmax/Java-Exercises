package ternary_exercises;
import java.util.Scanner;
public class BuyukKucukSayilar {
    public static void main(String[] args) {
        // Kullanicidan iki sayi aliniz, "buyuk olmayan" (kucuk veya esit olan) sayiyi yazdiriniz

        Scanner input = new Scanner(System.in);
        System.out.println("Sirasiyla 2 sayi giriniz");


















        double a = input.nextDouble();
        double b = input.nextDouble();

        System.out.println(a < b ? a : b);


    }
}
