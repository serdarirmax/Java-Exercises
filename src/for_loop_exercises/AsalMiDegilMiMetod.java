
package for_loop_exercises;
public class AsalMiDegilMiMetod {
	
	public static boolean asalMi(int sayi) {

		// Girilen sayinin Asal olup olmadiğini donduren bir metod olusturunuz.
		//
























		if(sayi==1) {
			return false;
		}
		for(int i=2;i<sayi;i++) {
			if(sayi%i==0) {
				return false;
			}
		}
		return true;
	}
	public static void main(String[] args) {
		System.out.println(asalMi(23));

	}

}
