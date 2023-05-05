package yapilanEgzersizler;

public class arrayArama {
    public static void main(String[] args) {

        int [] sayilar= new int[] {6,8,9,14,7,2,4};
        int aranacak = 9;
        boolean varMi=false;
        for (int sayi:sayilar ) {
            if (sayi==aranacak){
                varMi=true;
                break;
            }
        }
        if (varMi){
            System.out.println("bulk");
        } else {
            System.out.println("malesef");
        }




    }

}
