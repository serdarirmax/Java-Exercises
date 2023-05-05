//palindromik kelime(tersi kendisiyle ayni olan kelime)
//ata
package GG.Anonim.E57;


public class Main {

	public static void palindromikMi(String text) {
		String yeniText="";
		for(int i=text.length()-1;i>=0;i--) {
			yeniText=yeniText+text.charAt(i);
			}
		if(yeniText.equals(text)) {
			System.out.println("palindromik kelime");
		}else {
			System.out.println("palindromik kelime de�il");
		}
		
	}
	public static void main(String[] args) {
		palindromikMi("626");
		palindromikMi("kabak");
	}

}
