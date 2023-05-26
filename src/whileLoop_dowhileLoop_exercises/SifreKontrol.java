package whileLoop_dowhileLoop_exercises;

import java.util.Scanner;

public class SifreKontrol {
    public static void main(String[] args) {
        /*
        Gecerli Username="admin" ve Password="pwd123" dur.
        Kullanicidan username ve password'u alin.
        Username ve password dogru ise console'a "Hesabiniza hosgeldiniz!" yazdirin.
        Username veya password yanlis ise 4 kere "Username ve password'unuzu giriniz" mesaji versin
        Username veya password 4. kere yanlis girilirse "Hesabiniz bloke olmustur" mesaji vererek islemi tamamlayiniz
 */
        Scanner input = new Scanner(System.in);

        int sayac=0;
        do {
            System.out.println("Lutfen kullanici adini giriniz");
            String userName = input.next();
            System.out.println("Lutfen sifrenzi giriniz");
            String pass = input.next();
            if (userName.equals("admin")&&pass.equals("pwd123")){
                System.out.println("Hosgeldiniz");
                break;
            }

            sayac++;
        }while (sayac<4);
        System.out.println("Gecersiz Username ve/veya sifre");
    }
}
