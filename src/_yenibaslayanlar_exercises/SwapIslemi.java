package _yenibaslayanlar_exercises;

import java.util.Scanner;

public class SwapIslemi {
    public static void main(String[] args) {
        // Kullanicidan 2 sayi aliniz ve bunlarin degerlerinin yerlerini degistirmek icin bir kod yaziniz.




























        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen sirasiyla yerlerinin degismesi icin 2 sayi giriniz");
        int a = input.nextInt();
        int b = input.nextInt();
        System.out.println("sirasiyla girdiginiz sayilar :"+a+" "+b);

        int box = a;
         a = b;
         b = box;

        System.out.println("Girdiginiz sayilarin yeni hali :"+a+" "+b);




    }
}
