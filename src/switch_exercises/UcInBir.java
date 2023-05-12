package switch_exercises;

import java.util.Scanner;

public class UcInBir {
    		/*
			 Kullanicidan 3 harften birisini girmesini soyle ve girilen harfe gore cumleyi consolda yazdir.
	ORNEK:
	     INPUT      : A
	     OUTPUT  : Bedava peynir fare kapaninda olurmus.
	     INPUT      : B
	     OUTPUT  : Oluler, dirilerin hergun helva yedigini sanirmis.
	     INPUT      : C
	     OUTPUT  : Kurbagalar dunyayı dibinde yasadiklari kuyunun agzi kadar sanarmis.
			 */
    public static void main(String[] args) {























        Scanner scan = new Scanner(System.in);
        System.out.println("A & B & C'den birini giriniz");
        char secim = scan.next().toUpperCase().charAt(0);


        switch (secim){
            case 'A':
                System.out.println("Bedava peynir fare kapaninda olurmus.");
                break;
            case 'B':
                System.out.println("Oluler, dirilerin hergun helva yedigini sanirmis.");
                break;
            case 'C':
                System.out.println("Kurbagalar dunyayı dibinde yasadiklari kuyunun agzi kadar sanarmis.");
                break;
            default:
                System.out.println("Anlasilan okudugunu anlamada problem var! \nBir daha dene, yapabilirsin.");
        }
    }
}
