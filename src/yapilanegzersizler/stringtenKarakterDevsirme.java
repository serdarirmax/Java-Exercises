package yapilanegzersizler;

import java.util.Scanner;

public class stringtenKarakterDevsirme {
    /*
     * create 3 char variables then print A L I on the console using
     *  String  pickName = "ABCDEFGHIJKLMNOPQRSTUVWXYZ";
     */              //0123456789

    public static void main(String[] args) {
        String pickName = "ABCDEFGHIJKLMNOPRSTUVYZ";

        char karakter1 = pickName.charAt(0);
        char karakter2 = pickName.charAt(11);
        char karakter3 = pickName.charAt(8);

        System.out.println(karakter1 + " " + karakter2 + " " + karakter3);

        System.out.println(3 + 5 + "WiseQuarter" + 5 + 10 + 15 + (5+5));//8WiseQuarter5101510




    }

    public static class Practice101 {
        public static void main(String[] args) {
            /*
             Write a Java program that accepts two float numbers and checks if they are equal.
    EXAMPLE:
           INPUT      :
    first float number: 1235
    second float number: 2534

           OUTPUT :
    These numbers are different.
     */
            Scanner scan =new Scanner(System.in);
            System.out.println("karsilastirmak istediginiz iki sayiyi giriniz");
            float sayi1=scan.nextFloat();
            float sayi2= scan.nextFloat();

            if (sayi1 == sayi2){
                System.out.println(sayi1+" ve "+sayi2+ " birbirne esittir.");
            } else if (sayi1>sayi2) {
                System.out.println("Sayilar esit degil\n"+sayi1+", "+sayi2+" den buyuktur.");
            } else {
                System.out.println("Sayilar esit degil\n"+sayi2+", "+sayi1+"'den buyuktur.");
            }

        }
    }

    public static class Practice102 {
                        /*
                Kullanicidan bir sifre aliniz.
                Eger sifre JavaLearner iste, console'da dogru degil ise yanlis yazdiriniz.
             */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Sifre giriniz");

            String sifre = scan.next();

            if(sifre.equals("JavaLearner")) {
                System.out.println("Dogru");
            }else{
                System.out.println("Yanlis");
            }

            if("JavaLearner".equals(sifre)){
                System.out.println("Dogru");
            }else{
                System.out.println("Yanlis");
            }

    //        if(sifre.equalsIgnoreCase("JavaLearner")) {
    //            System.out.println("Dogru Ignore Case");
    //        }


        }

    }
}
