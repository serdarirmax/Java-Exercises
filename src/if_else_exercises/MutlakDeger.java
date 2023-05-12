package if_else_exercises;
import java.util.Scanner;
public class MutlakDeger {
    public static void main(String[] args) {
        // Kullanicinin girdigi sayinin mutlak degerini alarak konsola yazdiran programi yaziniz.


        Scanner scan = new Scanner(System.in);
        System.out.println("Mutlak degerini almak istediginiz sayi giriniz");
























        int sayi = scan.nextInt();

        if (sayi<0){
            System.out.println(-sayi);
        } else {
            System.out.println(sayi);
        }


    }
}
