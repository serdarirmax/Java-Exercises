//Stringteki ortanci harfi bulan fonskiyon
package xduzenlenecek;

public class Arrays03 {
	public static void ortanca(String text) {
		String[] array=text.split("");
	    if(array.length%2==1) {
		System.out.println("ortanca harf: "+array[(array.length/2)]);
		}else {
		System.out.println("ortanca harf: "+array[((array.length/2)-1)]+array[(array.length/2)]);
	   	}
	}
	public static void main(String[] args) {
		ortanca("naber");
		ortanca("eleman");
  }
}
