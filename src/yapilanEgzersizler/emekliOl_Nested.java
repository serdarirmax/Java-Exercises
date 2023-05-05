package yapilanEgzersizler;

import java.util.Scanner;

public class emekliOl_Nested {
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Cinsiyetinizi giriniz. E/K ");
        char cinsiyet = scan.nextLine().toLowerCase().charAt(0);
        System.out.println("Lutfen yasinizi giriniz");
        int yas = scan.nextInt();

        if (cinsiyet =='e')
            if (yas<10 || yas>90) {
            System.out.println("Hatali yaþ girisi yaptiniz");
            }   else if (yas>=65) {
            System.out.println("Emekli olabilirsiniz.");
            }   else if (yas<65) {
            System.out.println("Erken yat! sabah ise gidecen.");
            }
        if (cinsiyet =='k')
            if (yas<10||yas>90) {
            }   else if (yas>=60) {
                System.out.println("Emekli olabilirsiniz.");
            }   else if (yas<60) {
                System.out.println("Erken yat! sabah ise gidecen.");
            }
    }
}
