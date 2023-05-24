package for_loop_exercises;
import java.util.Scanner;
public class SayiYazdir01 {
    public static void main(String[] args) {
        /*
        Example 1: Kullanicidan baslangic ve bitis degerlerini alin.
        Baslangic degerinden baslayip bitis degerine kadar aradaki tum cift tamsayilari ekrana yazdiriniz
        9 - 14 ==> 10  12  14
     */
        Scanner scan = new Scanner(System.in);

















        System.out.println("Baslangic degerini giriniz");
        int bas = scan.nextInt();
        System.out.println("Bitis degerini giriniz");
        int bit = scan.nextInt();
        if (bas < bit) {
            for (int i = bas; i <= bit; i++) {
                if (i%2==0){
                    System.out.println(i+" ");
                }
        }
        }else {
            System.out.println("Hatali gisis yaptiniz.");
        }

    }
}
