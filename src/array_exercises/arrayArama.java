package array_exercises;

public class arrayArama {
    public static void main(String[] args) {

        int [] sayilar= new int[] {6,8,9,14,7,2,4};
        int aranacak = 9;
        // Aranacak sayinin olup olmadigini konsola yazdiran programi yaziniz.





















        boolean varMi=false;
        for (int sayi:sayilar ) {
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("aha da burada!");
        } else {
            System.out.println("malesef yok.");
        }




    }

}
