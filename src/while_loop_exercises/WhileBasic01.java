package while_loop_exercises;

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
    }
}
