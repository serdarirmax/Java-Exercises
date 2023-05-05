package Interwiew_Sorulari;

public class ForLoopContinue {
    public static void main(String[] args) {
        /*
        1==>100 e kadar 6 ile b�l�nenler hari� t�m tamsay�lar� erkana yazd�r�n.
        */


        for (int i = 1; i <101; i++) {

            if (i%6==0){
                continue;


            }System.out.print(i+" ");

        }
    }
}
