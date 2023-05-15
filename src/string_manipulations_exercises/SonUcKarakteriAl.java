package string_manipulations_exercises;
import java.util.Scanner;
public class SonUcKarakteriAl {
    		/*
        Verilen bir dizgenin son üç karakterini alan ve bu üç karakteri dizgenin hem önüne
    	hem de arkasına toplayan bir Java programı yazınız.
    	Dize uzunluğu üçten büyük ve daha fazla olmalıdır.

         INPUT      : Ankara
         OUTPUT  : araAnkaraara
		 */
    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        System.out.println("Birsey giriniz");
        String str = scan.next();
























        String sonUcch = str.substring(str.length()-3);
        System.out.println(sonUcch+str+sonUcch);




    }
}
