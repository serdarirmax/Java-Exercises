//Banka atmsi
package GozdenGecir.Anonim.E26;
import java.util.Scanner;

public class Main {
	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.println("Atm'ye Ho�geldiniz.");
		double bakiye=0;
		System.out.println("��lem Se�iniz\n1-Bakiye Sorgu\n2-Para �ek\n3-Para Yat�r\n4-��k��");
		while(true) {
			System.out.print("��leminiz: ");
			int islem=scanner.nextInt();
			if(islem==1) {
				System.out.println("Bakiyeniz: "+bakiye+" TL.");
			}else if(islem==2) {
				System.out.print("�ekilecek miktar: ");
				double cek=scanner.nextDouble();
				if(cek>bakiye) {
					System.out.println("Hesab�n�zda bu kadar para bulunmamaktad�r..\nBakiyeniz: "+bakiye+" TL.");
				}else {
					System.out.print("Para �ekiliyor..\n");
					bakiye=bakiye-cek;
				}
		    }else if(islem==3) {
		    	System.out.print("Yat�r�lacak miktar: ");
		    	double yatir=scanner.nextDouble();
		    	System.out.print("Para yat�r�ld�.\n");
		    	bakiye=bakiye+yatir;
		    }else if(islem==4) {
		    	System.out.println("��k�� yap�l�yor...");
		    	break;
		    }else {
		    	System.out.println("Hatal� i�lem girdiniz..");
		    }
		}
	}
}
