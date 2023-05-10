package yapilanegzersizler;

import java.util.Scanner;

public class yesOrNo {
    /*
     * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
     * ekrana yazdiran java kodunu yaziniz.
     * INPUT : Y ,  N
     * OUTPUT : YES ; NO
     */
    public static void main(String[] args) {
        System.out.println("Y or N");
       char str=new Scanner(System.in).nextLine().charAt(0);
       if (str=='y'||str=='Y'){
           System.out.println("YES");
       } else if (str=='n'||str=='N') {
            System.out.println("NO");
       } else {
           System.out.println("Yanlis bir karakter girdin olum");
       }


    }
}