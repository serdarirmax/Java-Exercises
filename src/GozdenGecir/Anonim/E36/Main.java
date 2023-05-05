//girilen stringte harf ve rakam say�s�n� g�steren kod
package GozdenGecir.Anonim.E36;

public class Main {
	public static void say(String text) {
		char[] rakamlar={'0','1','2','3','4','5','6','7','8','9'};
		char[] harfler= {'q','w','e','r','t','y','u','�','o','p','�','�'
				,'a','s','d','f','g','h','j','k','l','�','i','z','x','c','v','b'
				,'n','m','�','�'};
		int harfsayisi=0;
	    int rakamsayisi=0;
	    text.toLowerCase();
		for(int i=0;i<=text.length()-1;i++) {
			for(char j:rakamlar) {
				if(text.charAt(i)==j) {
					rakamsayisi+=1;
				}
			}
			for(char j:harfler) {
					if(text.charAt(i)==j) {
						harfsayisi+=1;
	}}}System.out.println("Harf sayisi: "+harfsayisi+"\nRakam sayisi: "+rakamsayisi);
			}
		
	public static void main(String[] args) {
		say("bugun 13 derece hava");
}
}