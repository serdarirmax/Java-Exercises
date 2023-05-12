package interwiew_sorulari;

import java.util.Scanner;

public class forLoops4 {
    public static void main(String[] args) {

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen tersten yazilmasini istediginiz bir ifade yaziniz");
        String str= scan.nextLine();
        //String str = "SERDAR JAVA OGRENIYOR";
        String tersstr= "";

        for (int i = str.length()-1; i >=0; i--) {
            tersstr+= str.substring(i,i+1);

        }
        System.out.println(tersstr);
    }
}
