// yuksekligi genisligi verilen dikdortgen olustur(yildizlarla)
package duzenlenecekler.E44;

public class Main {

	public static void dikdortgenOlustur(int yukseklik,int genislik) {
		for(int i=0;i<yukseklik;i++) {
			for(int j=0;j<genislik;j++) {
				System.out.print("* ");
			}
			System.out.println();
		}
	}
	public static void main(String[] args) {
		dikdortgenOlustur(4, 10);

	}

}
