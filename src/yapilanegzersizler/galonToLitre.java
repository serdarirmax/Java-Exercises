package yapilanegzersizler;

import java.util.Scanner;

public class galonToLitre {
    public static void main(String[] args) {
        double litre=3.785;

        System.out.println("Litreye donusturmek istediginiz galonu yaziniz");
        double galon= new Scanner(System.in).nextDouble();

        double veri=litre*galon;

        System.out.println(galon+" galon ="+ veri + "litre");


    }
}
