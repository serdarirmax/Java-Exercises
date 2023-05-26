package for_loop_exercises;
import java.util.Scanner;
public class SayininKatlari {
    public static void main(String[] args) {
        /*   Kullanicidan sisteme bir sayi girmesini isteyiniz.
         1'den kullanicinin girdigi sayiya kadar yazdiriniz
        NOT:
        3'un ve 5'in katı olan sayıların yerine 15k yazdırılacak
        5'in katı olan sayıların yerine 5k yazdırılacak
        3'un katı olan sayıların yerine 3k yazdırılacak
        Ornegin : 1 2 3k 4 5k 3k 7 8 3k 5k 11 3k 13 14 15k...    */

        Scanner scan = new Scanner(System.in);

























        System.out.println("Lutfen bir sayi giriniz");
        int sayi = scan.nextInt();
        for (int i = 1; i <=sayi ; i++) {
            if (i%3==0&&i%5==0){
                System.out.print("15K ");
            } else if (i%3==0) {
                System.out.print("3K ");
            } else if (i%5==0) {
                System.out.print("5K ");
            } else {
                System.out.print(i+" ");
            }

        }
    }
}
