// istenilen satir kadar baklava dilimi hazirlayan fonksiyon.
package GG.Anonim.E43;

public class Main {
	public static void baklavaOlustur(int sat�r) {
		for(int i=1;i<=sat�r;i++) {
			for(int j=0;j<sat�r-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}System.out.println();
		}
		for(int i=sat�r-1;i>0;i--) {
			for(int j=0;j<sat�r-i;j++) {
				System.out.print(" ");
			}for(int k=0;k<2*i-1;k++) {
				System.out.print("*");
			}System.out.println();
		}}
   public static void main(String[] args) {
		baklavaOlustur(10);

	}

}
