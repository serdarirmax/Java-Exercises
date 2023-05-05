package yapilanEgzersizler;

import java.util.Scanner;

public class emekliOl1 {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz. E/K ");
        char cinsiyet = scan.nextLine().toLowerCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet != 'e'& cinsiyet!='k'){
            System.out.println("Yanlis giris yaptiniz");
        } else if (cinsiyet=='e'& yas>=65) {
            System.out.println("Emekli olabilirsiniz.");
        } else if (cinsiyet=='e' & yas<65) {
            System.out.println("Erken yat! sabah ise gidecen.");
        } else if (cinsiyet=='k' & yas>=65) {
            System.out.println("Emekli olabilirsiniz");
        } else if (cinsiyet=='k' & yas<65) {
            System.out.println("Erken yat! sabah ise gidecen.");
        }


    }
}
