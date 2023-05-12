//Hesap Makinesi
package duzenlenecekler;
import java.util.Scanner;

public class HesapMakinesi {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("��lem se�iniz\n1-Toplama\n2-��karma\n3-�arpma\n4-B�lme\n5-��k��");
		while(true) {
			System.out.print("��leminiz: ");
			int islem=scanner.nextInt();
			if(islem==1) {
				System.out.println("Birinci sayi:");
				double a=scanner.nextDouble();
				System.out.println("�kinci sayi:");
				double b=scanner.nextDouble();
				System.out.println(a+b);
			}
			else if(islem==2) {
				System.out.println("Birinci sayi:");
				double a=scanner.nextDouble();
				System.out.println("�kinci sayi:");
				double b=scanner.nextDouble();
				System.out.println(a-b);
			}
			else if(islem==3) {
				System.out.println("Birinci sayi:");
				double a=scanner.nextDouble();
				System.out.println("�kinci sayi:");
				double b=scanner.nextDouble();
				System.out.println(a*b);
			}
			else if(islem==4) {
				System.out.println("Birinci sayi:");
				double a=scanner.nextDouble();
				System.out.println("�kinci sayi:");
				double b=scanner.nextDouble();
				System.out.println(a/b);
			}else if(islem==5) {
				System.out.println("Hesap Makinesinden ��k�l�yor..");
				break;
			}else {
				System.out.println("Hatal� i�lem girdiniz.");
			}
	}
	}
}
