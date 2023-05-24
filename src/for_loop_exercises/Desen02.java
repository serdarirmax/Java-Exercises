package for_loop_exercises;

public class Desen02 {
    public static void main(String[] args) {
        /*     Aşagidaki deseni for kullanarak elde eden kodu yaziniz.
                A
                A A
                A A A
                A A A A
        */






















        int sutun = 4; //rows
        //int satir = satiri her loopta 1 artmasi için i yapiyoruz. // columns
        for (int i = 1; i <=sutun; i++) {
            String s = "";

            for (int j = 1; j <=i; j++) {
                s+="A ";
            }
            System.out.println(s);
        }





    }
}
