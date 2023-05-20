//kelimedeki unlu unsuz sayilarini veren fonskiyon
//bul("bilgisayar")
//unlu:4
//unsuz:6
package xduzenlenecek.E56;

public class Main {
 public static void bul(String text) {
		text.toLowerCase();
		char[] unlu={'a','e','u','o','i'};
		char[] unsuz= {'q','w','r','t','y','p','s','d','f','g','h','j','k','l','z','x','c','v','b',
				'n','m'};
		int unlusayi=0;
		int unsuzsayi=0;
		for(int i=0;i<text.length();i++) {
			for(char j:unlu) {
				if(text.charAt(i)==j) {
					unlusayi+=1;
				}
				}
			for(char j:unsuz) {
				if(text.charAt(i)==j) {
					unsuzsayi+=1;
				}
				}
			}
		System.out.println("Kelimedeki unlu sayisi: "+unlusayi+"\nKelimedeki unsuz sayisi: "+unsuzsayi);
				}
	public static void main(String[] args) {
		bul("bilgisayar");
			}
}