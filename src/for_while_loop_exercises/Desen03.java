package for_while_loop_exercises;

public class Desen03 {
    public static void main(String[] args) {
        /*
        Asagidaki görüntüyü bir for dongusu kullanarak elde eden kodu yaziniz.
        A A A A A A A A
        A X X X X X X A
        A X X X X X X A
        A X X X X X X A
         */
























        int rows = 4;
        int columns = 7;

        for (int i = 0; i <rows; i++) {
            System.out.print("A ");
            for (int j = 1; j <columns; j++) {
                if (i==0){
                    System.out.print("A ");
                } else {
                    System.out.print("X ");
                }
            }
            System.out.println("A ");
        }
    }
}
