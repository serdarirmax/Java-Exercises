package interwiew_sorulari;

import java.util.Scanner;

public class forLoops3 {
    public static void main(String[] args) {
        // Kullan�c�dan bir String isteyin ve stringi tersten yazd�r�n.

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tersten yazilmasini istediginiz bir ifade yaziniz");
        String str= scan.nextLine();
        for (int i = str.length()-1; i >=0; i--) {
            System.out.print(str.charAt(i));
        }


        }
    }
