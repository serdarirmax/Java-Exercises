//kirmizi mavi iki takim olsun
//her takim iki zar atiyor(random bilgisayar)
//gelen zarlarin toplami buyuk olan kazanir.
//duses gelirse vurgula
package GozdenGecir.Anonim.E27;
import java.util.Random;
public class Main {
 public static void main(String[] args) {
		Random rand=new Random();
		int kirmizi1=rand.nextInt(6);
		kirmizi1+=1;
		int kirmizi2=rand.nextInt(6);
		kirmizi2+=1;
		
		int mavi1=rand.nextInt(6);
		mavi1+=1;
		int mavi2=rand.nextInt(6);
		mavi2+=1;
		
		if(kirmizi1+kirmizi2>mavi1+mavi2) {
			System.out.println("K�rm�z� tak�m: "+kirmizi1+","+kirmizi2+"\nMavi Tak�m: "+mavi1+","+mavi2);
			System.out.println("Kazanan k�rm�z� tak�m..!");
			if(kirmizi1==6 && kirmizi2==6) {
				System.out.println("Hem  de d��e�le..!!!!!!");
			}
	   }else if(mavi1+mavi2>kirmizi1+kirmizi2) {
		System.out.println("K�rm�z� tak�m: "+kirmizi1+","+kirmizi2+"\nMavi Tak�m: "+mavi1+","+mavi2);
		System.out.println("Kazanan mavi tak�m..!");
		if(mavi1==6 && mavi2==6) {
			System.out.println("Hem  de d��e�le..!!!!!!");
		}
	  }else {
		System.out.println("K�rm�z� tak�m: "+kirmizi1+","+kirmizi2+"\nMavi Tak�m: "+mavi1+","+mavi2);
		System.out.println("Sonu� berabere.");
	}
}
}
