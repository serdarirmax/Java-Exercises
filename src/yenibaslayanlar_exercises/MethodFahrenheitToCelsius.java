package yenibaslayanlar_exercises;

import java.util.Scanner;

public class MethodFahrenheitToCelsius {
    public static void main(String[] args) {
        // Fahrenheit değeri, Celsius değere çeviren method yazınız.
        // formül: c = (f-32)/1.8
        //yani fahrenheit degerini bu methoda gonderdıgımde bana celsius cinsinden sıcaklık donmeli






























        Scanner scanner = new Scanner(System.in);
        System.out.println("Lutfen donusturulmesini istediginiz Fahrenayt degerini giriniz");
        double input = scanner.nextDouble();
        double celsius = fahrenheitToCelsius(input);




    }

    public static double fahrenheitToCelsius(double input) {
        double celsius = (input-32)/1.8;
        System.out.println(celsius);
        return celsius;
    }
}
