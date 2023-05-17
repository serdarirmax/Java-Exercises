package if_else_exercises;
import java.util.Scanner;
public class EmekliOlBasic {
    public static void main(String[] args) {
        /*
           Kullanicidan 0'dan kucuk 120'den buyuk deger giremiyecek sekilde datalari aldiktan sonra
           Eger calisan kadin ise;
            60 yasindan buyukse "Emekli Olabilir "yazdirin
           Eger calisan erkek ise;
            65 yasindan buyukse "Emekli Olabilir" yazdiran kodu olusturunuz
        */
        Scanner scan = new Scanner(System.in);




























        System.out.println("Lutfen cinsiyetinizi giriniz.");
        String gender = scan.next();
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (yas >0 || yas <120){
            System.out.println("Yasiniz 0 ile 120 arasinda olmali");
        }
        if (gender.equalsIgnoreCase("erkek")){
            if (yas>65){
                System.out.println("Beyefendi emekli olabilirsiniz");
            }else {
                System.out.println("Beyefendi malesef emekli olamazsiniz");
            }
        } else if (gender.equalsIgnoreCase("kadin")) {
            if (yas>60){
                System.out.println("Hanimefendi emekli olabilirsiniz");
            }else {
                System.out.println("Hanimefendi malesef emekli olamazsiniz");
            }
        } else {
            System.out.println("Tanimli degil...");
        }




    }
}
