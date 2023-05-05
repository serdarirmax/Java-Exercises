//girilen stringte harf ve rakam say�s�n� g�steren kod
package GG.Anonim.E36;

public class Main {
	public static void say(String text) {
		char[] rakamlar={'0','1','2','3','4','5','6','7','8','9'};
		char[] harfler= {'q','w','e','r','t','y','u','�','o','p','�','�'
				,'a','s','d','f','g','h','j','k','l','�','i','z','x','c','v','b'
				,'n','m','�','�'};
		int harfsay�s�=0;
	    int rakamsay�s�=0;			
	    text.toLowerCase();
		for(int i=0;i<=text.length()-1;i++) {
			for(char j:rakamlar) {
				if(text.charAt(i)==j) {
					rakamsay�s�+=1;
				}
			}
			for(char j:harfler) {
					if(text.charAt(i)==j) {
						harfsay�s�+=1;
	}}}System.out.println("Harf say�s�: "+harfsay�s�+"\nRakam say�s�: "+rakamsay�s�);
			}
		
	public static void main(String[] args) {
		say("bug�n 13 derece hava");
}
}