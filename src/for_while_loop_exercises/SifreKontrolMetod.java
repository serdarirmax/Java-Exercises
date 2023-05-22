package for_while_loop_exercises;
import java.util.Scanner;
public class SifreKontrolMetod {
    // Soru 4 : Kullanicidan bir sifre isteyip, asagidaki sartlari kontrol edin
    // ve kullaniciya duzeltmesi gereken tum eksikleri soyleyin,
    // eger tum sartlari saglarsa, "sifre basariyla kaydedildi" yazdirin
    // - ilk harf kucuk harf olmali
    // - son karakter rakam olmali
    // - sifre bosluk icermemeli
    // - uzunlugu en az 10 karakter olmali

    // sifre kontrolunu bir method'da yapip true / false dondurun
    // main method'da donen sonucu kontrol edip
    // "basari ile olusturuldu" yazincaya kadar
    // sifreyi tekrar tekrar isteyin

    public static void main(String[] args) {
        Scanner scan =new Scanner(System.in);
























        String sifre="";
        boolean tekrarSifreIste = true;

        while (tekrarSifreIste) {
            System.out.println("Lutfen sifrenizi giriniz...");
            sifre = scan.nextLine();
            if (sifreyiKontrolEt(sifre)) {
                System.out.println("Giris basarili...");
                break;
            }
        }
    }
    public static Boolean sifreyiKontrolEt(String sifre){
        int bayrak=0;
        if (!(sifre.charAt(0)>='a'&& sifre.charAt(0)<='z')){
            System.out.println("ilk harf kucuk harf olmali");
            bayrak++;
        }
        if (!(sifre.charAt(sifre.length()-1)>'0' && sifre.charAt(sifre.length()-1)<='9')){
            System.out.println("son karakter rakam olmali");
            bayrak++;
        }
        if (sifre.contains(" ")){
            System.out.println("sifre bosluk icermemeli");
            bayrak++;

        }
        if (!(sifre.length()>9)){
            System.out.println("uzunlugu en az 10 karakter olmali");
            bayrak++;
        }
        if (bayrak==0){
            return true;
        } else {
            return false;
        }

    }
}
