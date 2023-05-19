package if_else_exercises;
import java.util.Scanner;
public class TernaryMethod {
    public static void main(String[] args) {
        //  kullanicidan pozitif bir sayi aliniz
        //  verilen sayinin 3 veya daha cok basamakli olup olmadigini ternary ile kontrol eden
        //  ve yazdıran bir method olusturun
        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen 3 basamakli pozitif bir tamsayi giriniz");
        int sayi = scan.nextInt();

























        ucBasamakMi(sayi);

    }

    public static void ucBasamakMi(int sayi) {
        System.out.println(sayi > 99 ? "true" : "false");
    }
}
