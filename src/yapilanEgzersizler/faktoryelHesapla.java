//Klavyeden girilen sayi kadar (N) sayinin faktoryelini alan kod
package yapilanEgzersizler;
import java.util.Scanner;

public class faktoryelHesapla {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayý giriniz: ");
		int a=scanner.nextInt();
		int fakt=1;
		for(int i=1;i<=a;i++) {
			fakt=fakt*i;
	   }
		System.out.println("Girdiginiz sayinin faktoriyeli "+fakt);

	}

}
