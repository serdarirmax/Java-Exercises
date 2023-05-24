package for_loop_exercises;

public class FaytoryelMethod {
    public static void main(String[] args) {
        // 15ten kucuk sayilarin girilmesi halinde faktöryelini bulan
        // sayinin 15 ten buyuk olmasi halinde uyari veren bir metod yaziniz.
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
