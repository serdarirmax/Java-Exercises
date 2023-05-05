package yapilanEgzersizler;

import java.util.Scanner;

public class karakterinAsciiDegeri {
    			/*
			 Kullanicidan bir karakter girmesini isteyip, o karakterin ascii degerini yazdirin

	ORNEK:
	             INPUT : #
	 			 OUTPUT : girdiginiz # karakterinin ascii degeri = 125'dir.
			 */

    public static void main(String[] args) {
        Scanner scan = new Scanner(System.in);
        char karakter1 = scan.next().charAt(0);
        System.out.println(karakter1 + 0);
    }

    public static class Practice103 {
            /*

        Kullanicidan bir sayi alip bu sayinin mutlak degerini yazan Java kodunu yaziniz.
             */

        public static void main(String[] args) {
            Scanner scan = new Scanner(System.in);
            System.out.println("Mutlak degerini gormek istediginiz bir sayi giriniz");
            int sayi = scan.nextInt();

            if(sayi<0){
                System.out.println(-sayi);
            }else{
                System.out.println(sayi);
            }
        }

    }
}
