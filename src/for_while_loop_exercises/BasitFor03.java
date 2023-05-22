package for_while_loop_exercises;

public class BasitFor03 {
    public static void main(String[] args) {
        // verilen string teki son 'a' dan sonraki tum karakterleri ters sira ile yazdirin.
        // "Germany" ==> yn

        String t ="Germany";
























        for ( int i= t.length()-1 ; i>=0 ; i-- ){

            if(t.charAt(i)=='a'){
                break;
            }

            System.out.print(t.charAt(i));
        }






    }
}
