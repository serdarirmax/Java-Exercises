package switch_exercises;
import java.util.Scanner;
public class OgrNotu {
    public static void main(String[] args) {
        /*    Kullanicidan 0-4 arasi sinav puanini sisteme girmesini isteyiniz.

              Eger puani 0,0-1,0 arasinda ise KALDI seviyesi veriniz
              puani 1,0-2,0 arasinda ise GECTI seviyesi veriniz
              puani 2,0-2,5 arasinda ise IYI seviyesi veriniz
              puani 2,5-3,5 arasinda ise UST seviyesi veriniz
              puani 3,5-4,0 arasinda ise HARIKA seviyesi veriniz
                seviyesini yazdiriniz

        switch case kullanarak KALDI seviyesine F harf notu veriniz
                               GECTI seviyesine D harf notu veriniz
                               IYI seviyesine C harf notu veriniz
                               UST seviyesine B harf notu veriniz
                               HARIKA seviyesine A harf notu veriniz

             harf notunu yazdiriniz.
        */
        Scanner scan = new Scanner(System.in);



























        System.out.println("Lutfen 0-4 arasi sinav puaninizi sisteme giriniz");
        double puan = scan.nextDouble();
        String seviye ="YOK";
        if (puan<0||puan>4){
            System.out.println("0-4 arasi sinav puaninizi girmelisiniz");
        } else if (puan<1) {
            seviye="KALDI";
        } else if (puan<2) {
            seviye="GECTI";
        }else if (puan<2.5) {
            seviye="IYI";
        }else if (puan<3.5) {
            seviye="UST";
        }else {
            seviye="HARIKA";
        }
        System.out.println("Durum  : "+seviye);
        char harfNotu = ' ';
        switch (seviye){
            case "KALDI":
                harfNotu='F';break;
            case "GECTI":
                harfNotu='D';break;
            case "IYI":
                harfNotu='C';break;
            case "UST":
                harfNotu='B';break;
            case "HARIKA":
                harfNotu='A';break;
            default:
                harfNotu='X';


        }System.out.println("Derece : "+harfNotu);




    }
}
