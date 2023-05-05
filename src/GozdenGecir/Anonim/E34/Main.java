
//En kucuk ortak kat(ekok) bulma
package GozdenGecir.Anonim.E34;

public class Main {
	public static void ekokBul(int a,int b) {
		int ekok = 1;
		for(int i=a*b;i>=1;i--) { // en sonuncu ortak kat� al�yoruz burada ekok i�in.��nk� b�y�k di�er katlar da var.
			if(i%a==0 && i%b==0) {
				ekok=i;
			}
	}
		System.out.println("Ekok: "+ekok);
	}
	public static void main(String[] args) {
		ekokBul(5,15);
		}
}
