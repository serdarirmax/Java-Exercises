package switch_exercises;
import java.util.Scanner;
public class HangiMevsim {
    public static void main(String[] args) {
        // Kullanicidan yilin kacinci ayinda oldugu bilgisini rakam olarak al
        // ve konsolda hangi mevsimde oldugu bilgisini veriniz.

        Scanner scan = new Scanner(System.in);
        System.out.println("Yilin kacinci ayindayiz (1,...,12)");


























        int a = scan.nextInt();
        switch (a) {
            case 12:
            case 1:
            case 2:{
                System.out.println("Kis Mevsimi");
            }
            break;
            case 3:
            case 4:
            case 5: {
                System.out.println("Ilkbahar Mevsimi");
            }
            break;
            case 6:
            case 7:
            case 8: {
                System.out.println("Yaz Mevsimi");
            }
            case 9:
            case 10:
            case 11: {
                System.out.println("Sonbahar Mevsimi");
            }
            default: {
                System.out.println("yanlis bir rakam girdiniz");
            }
        }


    }
}
