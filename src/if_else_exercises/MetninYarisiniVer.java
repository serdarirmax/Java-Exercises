package if_else_exercises;
import java.util.Scanner;
public class MetninYarisiniVer {
            /*
            Kullanicinin girdigi metnin harf sayisi çift sayi ise ilk yarisini alip yazdiran kod yaziniz
			ORNEK:
			     INPUT  :  Python
                 OUTPUT :   Pyt
	        */
            public static void main(String[] args) {
                Scanner input = new Scanner(System.in);
                System.out.println("Lutfen metin giriniz");


























                String str = input.next();
                if (str.length()%2==0){
                    System.out.println(str.substring(0,str.length()/2));
                } else {
                    System.out.println("Hatali metin girisi");
                }

            }







}
