package if_else_exercises;
import java.util.Scanner;
public class YilinAylari {
    public static void main(String[] args) {
        //Ay sayisini verdiginizde ay ismini yazan kodu yaziniz
        //  1==> January, 2 ==> February .....
        Scanner input = new Scanner(System.in);
        System.out.println("Yilin kacinci ayi?");






























        byte ay = input.nextByte();

        if (ay==1){
            System.out.println("Ocak");
        } else if (ay==2) {
            System.out.println("Subat");
        }else if (ay==3) {
            System.out.println("Mart");
        }else if (ay==4) {
            System.out.println("Nisan");
        }else if (ay==5) {
            System.out.println("Mayis");
        }else if (ay==6) {
            System.out.println("Haziran");
        }else if (ay==7) {
            System.out.println("Temmuz");
        }else if (ay==8) {
            System.out.println("Agustos");
        }else if (ay==9) {
            System.out.println("Eylul");
        }else if (ay==10) {
            System.out.println("Ekim");
        }else if (ay==11) {
            System.out.println("Kasim");
        }else if (ay==12) {
            System.out.println("Aralik");
        }else {
            System.out.println("Cok sasiracaksin ama bir yilda 12 ay vardir.");
        }
    }
}
