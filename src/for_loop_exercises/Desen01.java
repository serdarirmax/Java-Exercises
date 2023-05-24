package for_loop_exercises;

public class Desen01 {
    public static void main(String[] args) {
        /*
        Aşağıdaki görüntüyü bir for döngüsü kullanarak elde eden kodu yazınız.
        A A A A A
        A A A A A
        A A A A A
         */


























        int rows = 3;           //siralar
        int columns = 5;        //sutunlar
        for (int i = 1; i<=rows ; i++){
            String s ="";
            for (int j = 1; j<=columns; j++) {
                s+="A ";
            }
            System.out.println(s);
        }
    }
}
