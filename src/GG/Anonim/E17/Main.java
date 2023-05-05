// girilen herhangi bir sayinin tersini alan program
package GG.Anonim.E17;

import java.util.Scanner;


public class Main {

	public static void main(String[] args) {
		Scanner scanner =new Scanner(System.in);
		int sonu�=0;
	    System.out.println("Say� giriniz:");
		int say�=scanner.nextInt();
		
		while(say�>0) {
			sonu�=sonu�*10;
			sonu�=sonu�+say�%10;
			say�=say�/10;
		}
	System.out.println("Tersi: "+sonu�);
	
	}

}
