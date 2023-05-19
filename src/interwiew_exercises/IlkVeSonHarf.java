package interwiew_exercises;
import java.util.Scanner;
public class IlkVeSonHarf {
    public static void main(String[] args) {
/*
        Interview soru
         * Kulanicidan alinan bir Stringin ilk ve son harfini yine kulanicidan alinan sayi kadar
         * return eden metod yaziniz
         *
         * ornek:  input            output
         *         elma  2           eaea
         *         army  3           ayayay
*/
        Scanner input = new Scanner(System.in);
























        System.out.println("lutfen metin giriniz");
        String metin = input.nextLine();
        System.out.println("lutfen tekrar sayisi giriniz");
        int sayi = input.nextInt();
        char krk1 = metin.charAt(0);
        char krk2 = metin.charAt(metin.length()-1);
        String alinanMetin = ""+krk1+krk2;
        for (int i = 0; i < sayi ; i++) {
            System.out.print(alinanMetin);
        }



    }
}
