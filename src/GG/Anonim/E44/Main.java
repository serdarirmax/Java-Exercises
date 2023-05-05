// yuksekligi genisligi verilen dikdortgen olustur(yildizlarla)
package GG.Anonim.E44;

public class Main {

	public static void dikdortgenOlustur(int y�kseklik,int geni�lik) {
		for(int i=0;i<y�kseklik;i++) {
			for(int j=0;j<geni�lik;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		dikdortgenOlustur(4, 10);

	}

}
