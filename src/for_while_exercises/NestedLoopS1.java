package for_while_exercises;


public class NestedLoopS1 {
    /*
    1        1. satir 1’den 1’e kadar yazdir
    1 2      2. satir 1’den 2’e kadar yazdir
    1 2 3    3. satir 1’den 3’e kadar yazdir
    1 2 3 4  4. satir 1’den 4’e kadar yazdir
     */
    public static void main(String[] args) {

        for (int i = 1; i <=4 ; i++) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }
        for (int i = 3; i >=1; i--) {
            for (int j = 1; j <=i; j++) {
                System.out.print("* ");
            }
            System.out.println("");
        }


    }

}
