package yapilanEgzersizler;


public class NestedLoop {
    public static void main(String[] args) {

        /*
        * * * * * * * *    // bir satýrý nasýl yazdýracagýmýzý inner loop ile belirliyoruz.
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
        * * * * * * * *
         // Satýrda yaptýgýmýz iþlemide kac defa tekrar edeceðimizi ise outer look belirliyor.
         */

        for (int i = 1; i <=5; i++) {

            for (int j = 1; j <=8; j++) {

                System.out.print("* ");
            }
            System.out.println("");  // innerloop ile satýr iþlemi bittikten sonra alt satýra gecmek için.
        }
        
        
        
    }
}
