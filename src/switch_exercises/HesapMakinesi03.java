package switch_exercises;
import java.util.Scanner;
public class HesapMakinesi03 {
    public static void main(String[] args) {
        //Example 1: Kulanicidan iki sayi ve yapilacak islemi alan ve +, -, *, /, % islemlerini yapan kodu yaziniz
        Scanner input = new Scanner(System.in);


























        System.out.println("lutfen 2 sayi giriniz");
        double num1 = input.nextDouble();
        double num2 = input.nextDouble();
        System.out.println("Yapmak istediginiz islemi giriniz [+] [-] [*] [/] [%]");
        char islem = input.next().charAt(0);

        switch (islem) {
            case '+':
                System.out.println(num1+" + "+num2+" = "+(num1 + num2));
                break;
            case '-':
                System.out.println(num1+" - "+num2+" = "+(num1 - num2));
                break;
            case '*':
                System.out.println(num1+" * "+num2+" = "+(num1 * num2));
                break;
            case '/':
                System.out.println(num1+" / "+num2+" = "+(num1 / num2));
                break;
            case '%':
                System.out.println(num1+" % "+num2+" = "+((num1 * num2)/100));
                break;
            default:
                System.out.println("Hatali islem secimi yaptiniz");

        }
    }
}
