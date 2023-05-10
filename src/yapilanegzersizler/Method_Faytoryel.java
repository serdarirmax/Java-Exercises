package yapilanegzersizler;

public class Method_Faytoryel {
    public static void main(String[] args) {
        int sayi = 12;
        if (sayi>0 && sayi<15){
            faktoryelBul(sayi);
        }else {
            System.out.println("Lutfen 15 ten kucuk bir tam sayi giriniz...");
        }

    }
    public static void faktoryelBul(int sayi){
        int faktoryel = 1;
        for (int i = sayi; i >=1 ; i--) {
            faktoryel*=i;

        }System.out.println(sayi+"! = "+faktoryel);


    }

}
