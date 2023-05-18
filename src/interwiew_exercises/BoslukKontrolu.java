package interwiew_exercises;
import java.util.Scanner;
public class BoslukKontrolu {
    public static void main(String[] args) {
        //Kullanıcıdan alacağınız bir stringde boşluk karakterinin olup olmadığını kontrol ediniz.

        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir metin giriniz");























        String metin = input.nextLine();
        if (metin.replaceAll(" ","").length()==metin.length()){
            System.out.println("Girilen metinde bosluk yok.");
        }else {
            System.out.println("Girilen metinde bosluk karakteri var.");
        }





    }
}
