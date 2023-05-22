package switch_exercises;
import java.util.Scanner;
public class UlkeIsmi {
    public static void main(String[] args) {
        // Kullanicidan bir ulke adi aliniz ve karsiliginda ulke kısaltmalarini konsola yazdiriniz
        // America ==> USA, England ==> UK, Turkiye ==> TR ........

        Scanner input = new Scanner(System.in);































        System.out.println("Ulke ismi giriniz");
        String ulke = input.next();

        switch (ulke.toLowerCase()) {
            case "turkiye":
                System.out.println("TR");
                break;
            case "germany":
                System.out.println("DE");
                break;
            case "America":
                System.out.println("USA");
                break;
            case "india":
                System.out.println("IN");
                break;
            case "spain":
                System.out.println("ES");
                break;
            case "bulgaria":
                System.out.println("BG");
                break;
            case "england":
                System.out.println("UK");
                break;
            case "albania":
                System.out.println("AL");
                break;
            case "france":
                System.out.println("FR");
                break;
            default:
                System.out.println("Ulke ismi tanimli degil.");
        }
    }
}
