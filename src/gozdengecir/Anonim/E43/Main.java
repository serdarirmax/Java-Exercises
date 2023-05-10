// istenilen satir kadar baklava dilimi hazirlayan fonksiyon.
package gozdengecir.Anonim.E43;

public class Main {
	public static void baklavaOlustur(int satir) {
		for(int i=1;i<=satir;i++) {
			for(int j=0;j<satir-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=satir-1;i>0;i--) {
			for(int j=0;j<satir-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}System.out.println();
		}}
   public static void main(String[] args) {
		baklavaOlustur(10);

	}

}
