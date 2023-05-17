package string_manipulations_exercises;

public class StringKarakterAl {
    public static void main(String[] args) {
        //Ornek :  Bir string in belirli bir karakterinden baslayarak belirli bir karaktere kadar dynamic olarak aliniz
        //      abc@gmail.com   ===> gmail

        String a = "abc@gmail.com";


























        int startingIndex = a.indexOf('@')+1;
        int endingIndex = a.indexOf('.');
        String companyName = a.substring(startingIndex, endingIndex);
        System.out.println("companyName = " + companyName);//companyName = gmail
    }
}
