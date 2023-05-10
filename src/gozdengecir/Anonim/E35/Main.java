//en buyuk ortak b�len(ebob)bulma
package gozdengecir.Anonim.E35;

public class Main {
	public static void ebobBul(int a,int b) {
		int ebob=1;
		for(int i=1;i<=a;i++) { // i<=b'de yapabiliriz fark etmez sonu�ta en b�y�k ortak b�len ar�yoruz.
			if(a%i==0 && b%i==0) {
				ebob=i;
			}
		}System.out.println("Ebob:"+ebob);
	}

	public static void main(String[] args) {
		ebobBul(100, 8);

	}

}
