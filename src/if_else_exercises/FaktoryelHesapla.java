package if_else_exercises;
import java.util.Scanner;
public class FaktoryelHesapla {
	public static void main(String[] args) {

		//Klavyeden girilen (N) sayinin faktoryelini alan kod yaziniz

		Scanner scanner=new Scanner(System.in);
		System.out.println("Sayi giriniz: ");

























		int a=scanner.nextInt();
		int fakt=1;
		for(int i=1;i<=a;i++) {
			fakt=fakt*i;
	   }
		System.out.println("Girdiginiz sayinin faktoriyeli "+fakt);

	}

}
