package for_loop_exercises;

public class Desen04 {
    public static void main(String[] args) {
        /*  Ornek: Asagidaki sekli cizen kodu yaziniz
                    1
                    1 2
                    1 2 3
                    1 2 3 4
                    1 2 3 4 5
        */
























        int row = 5;
        for (int i = 1; i <=row; i++) {

            for (int j = 1; j <=i; j++) {
                System.out.print(j+" ");
            }
            System.out.println();
        }

    }
}
