package while_loop_exercises;
import java.util.Scanner;
public class WhileBasic03 {
    public static void main(String[] args) {
        // Kullanicidan toplanmak uzere sayilar alin, toplam 500 olursa ve 500u gecerse
        // kac sayi girildigini ve sayilarin toplamini konsola yadirin.
        Scanner scan = new Scanner(System.in);





















        int girilenSayi = 0;
        int toplam2 = 0;
        int girilenSayiAdet=0;
        while (toplam2 < 501) {
            System.out.println("sayi igr");
            girilenSayi= scan.nextInt();
            toplam2 += girilenSayi;
            girilenSayiAdet++;
        }
        System.out.println("Toplam "+girilenSayiAdet+" adet sayi girildi.\nGirilen sayilarin toplami : "+toplam2);


    }
}
