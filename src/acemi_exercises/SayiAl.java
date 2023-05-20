package acemi_exercises;
import java.util.Scanner;
public class SayiAl {
    public static void main(String[] args) {
        // SORU: Kullanicidan bir double, bir de int sayi alip bunlarin toplamini ve carpimini yazdirin.



























        System.out.println("Lutfen ondalikli bir sayi giriniz");
        Scanner scan = new Scanner(System.in);
        double doublesayi= scan.nextDouble();
        System.out.println("Lutfen tek basamakli bir sayi giriniz");
        int sayi = scan.nextInt();
        System.out.println("Girdiginiz sayilarin toplami : "+ (doublesayi+sayi));
        System.out.println("Girdiginiz sayilarin carpimi : "+ (doublesayi*sayi));
    }
}
