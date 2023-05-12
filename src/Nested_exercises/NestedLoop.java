package Nested_exercises;


public class NestedLoop {
    public static void main(String[] args) {

        /*
        * * * * * * * *    // bir sat�r� nas�l yazd�racag�m�z� inner loop ile belirliyoruz.
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
         // Sat�rda yapt�g�m�z i�lemide kac defa tekrar edece�imizi ise outer look belirliyor.
         */

        for (int i = 1; i <=5; i++) {

            for (int j = 1; j <=8; j++) {

                System.out.print("* ");
            }
            System.out.println("");  // innerloop ile sat�r i�lemi bittikten sonra alt sat�ra gecmek i�in.
        }
        
        
        
    }
}
