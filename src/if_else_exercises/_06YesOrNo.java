package if_else_exercises;

import java.util.Scanner;

public class _06YesOrNo {
    public static void main(String[] args) {
        /*
         * KullanicidanY/N ikilisinden birisini girdiginde girdigi degeri
         * ekrana yazdiran java kodunu yaziniz.
         * INPUT : Y ,  N
         * OUTPUT : YES ; NO
         */
































        System.out.println("Y or N");
       char str=new Scanner(System.in).nextLine().charAt(0);
       if (str=='y'||str=='Y'){
           System.out.println("YES");
       } else if (str=='n'||str=='N') {
            System.out.println("NO");
       } else {
           System.out.println("Yanlis bir karakter girdiniz.");
       }


    }

    public static class _07AsalMiMethod {
        public static void main(String[] args) {
            // asalSayiMi() adli bir metod olusturun. Parantez içine girilen sayinin asal olup olmadigini size dönmeli.

























            System.out.println(asalSayiMi(45));


        }
        public static boolean asalSayiMi(int sayi){
            boolean asalMi = true;
            for (int i = 2; i <sayi; i++) {
                if (sayi%i==0){
                    asalMi=false;
                }
            }
            return asalMi;
        }


    }
}