package whileLoop_dowhileLoop_exercises;
public class SayilarinCarpimi {
    public static void main(String[] args) {
        // 3 ile 9 arasindaki tam sayilarin çarpimini bulmak icin kodu yaziniz.
        // While Loop --- Do-While Loop























        int sayilarCarpimi =1;
        int i =4;
        while (i<9){
            sayilarCarpimi*=i;
            i++;
        }
        System.out.println(sayilarCarpimi);


        //Do-While Loop Asagida
        System.out.println("-------------");






















        int carpimSonucu = 1;
        int j = 4;
        do {
            carpimSonucu*=j;
            j++;
        }while (j<9);
        System.out.println(carpimSonucu);

    }
}
