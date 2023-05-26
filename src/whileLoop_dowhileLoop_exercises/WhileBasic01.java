package whileLoop_dowhileLoop_exercises;
public class WhileBasic01 {
    public static void main(String[] args) {
        // 3ten 9a kadar olan tam sayilarin toplamini yazdirin.




















        int toplam = 0;
        int i =3;
        while (i<10){
            toplam+=i;
            i++;
        }
        System.out.println(toplam);

        System.out.println("-------------");

        // surpriz soru: cozumu asagida...
        // 3 ile 9 arasindaki tam sayilarin carpimıni bulmak icin kodu yaziniz.



















        int sayi =4;
        int result =1;

        do {
            result*=sayi;
            sayi++;
        }while(sayi<9);

        System.out.println(result);





    }
}
