package whileLoop_dowhileLoop_exercises;
import java.util.Scanner;
public class CarpimTabolosu {
    public static void main(String[] args) {
        /*    Kullanicidan bir sayi alin ve sayinin carpim toblosunu kullaniciya konsolda veriniz
              3 ==> 3x1=3
                    3x2=6
                    3x3=9
                    3x4=12 ...
                    3x10=30
         */

        Scanner input = new Scanner(System.in);




























        System.out.println("Hangi sayinin carpimlarini gormek istersiniz?");
        int num = input.nextInt();

        int i=1;
        while (i<11){
            System.out.println(num+" x "+i+" = "+num*i);
            i++;
        }

    }
}
