//Girilen stringi ters ceviren kod
package for_loop_exercises;

import java.util.Scanner;


public class stringiTersCevir {

	public static void main(String[] args) {
		Scanner scanner=new Scanner(System.in);
		System.out.print("Kelime giriniz: ");
		String kelime=scanner.nextLine();
		String tersKelime="";

		for(int i=kelime.length()-1;i>=0;i--) {
			tersKelime=tersKelime+kelime.charAt(i);
		}
		System.out.println(tersKelime);
		}

}
