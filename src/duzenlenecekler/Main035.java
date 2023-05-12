// girilen herhangi bir sayinin tersini alan program
package duzenlenecekler;

import java.util.Scanner;


public class Main035 {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int sonuc=0;
	    System.out.println("Sayi giriniz:");
		int sayi=scanner.nextInt();
		
		while(sayi>0) {
			sonuc=sonuc*10;
			sonuc=sonuc+sayi%10;
			sayi=sayi/10;
		}
	System.out.println("Tersi: "+sonuc);
	
	}

}
