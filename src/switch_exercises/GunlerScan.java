package switch_exercises;
import java.util.Scanner;
public class GunlerScan {
    public static void main(String[] args) {
        /*  Kullanicidan yil ve ay numarasini ayri ayri sisteme girmesini isteyiniz.
            Girilen ay numarasina göre ayin kac gun cektigini yazdiriniz.
            NOT: 1, 3, 5, 7, 8, 10, 12. aylar 31 gun ceker
            4, 6, 9, 11. aylar 30 gun ceker
            2. ay 4 yilda bir 29 gun ceker, diger yillarda 28 gun ceker.
        */
            Scanner scan = new Scanner(System.in);

























            System.out.println("Lutfen bir yil giriniz");
            int yil = scan.nextInt();

            System.out.println("Lutfen 1-12 arasi bir ay numarasi giriniz");
            int ay = scan.nextInt();

            switch (ay) {
                case 1:
                case 3:
                case 5:
                case 7:
                case 8:
                case 10:
                case 12:
                    System.out.println("Girdiginiz ay 31 gun ceker");
                    break;
                case 4:
                case 6:
                case 9:
                case 11:
                    System.out.println("Girdiginiz ay 30 gun ceker");
                    break;
                case 2:
                    if (yil % 4 == 0) {
                        System.out.println("Girdiğiniz ay 29 gun ceker");
                    } else {
                        System.out.println("Girdiginiz ay 28 gun ceker");
                    }
                    break;
                default:
                    System.out.println("Lutfen gecerli bir ay numarası giriniz");

            }

        }
}
