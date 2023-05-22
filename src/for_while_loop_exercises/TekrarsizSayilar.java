package for_while_loop_exercises;

public class TekrarsizSayilar {
    public static void main(String[] args) {
        //  Benzersiz (Tekrar edilmeyen) rakamlari bir tamsayi olarak yazdirmak icin kod yaziniz.
        //  Ornek; 223878 ==> 37

        int sayi = 223878;
























        String str = String.valueOf(sayi);
        String ystr ="";

        for (int i =0; i<str.length() ;i++){
            String ch = str.substring(i,i+1);
        if (str.indexOf(ch)==str.lastIndexOf(ch)){
            ystr+=ch;

        }

        }
        System.out.println(ystr);
    }
}
