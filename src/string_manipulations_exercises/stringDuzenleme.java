package string_manipulations_exercises;
public class stringDuzenleme {
    public static void main(String[] args) {
        // Verilen stringin basinda ve sonundaki bosluklari silin
        // String içindeki harfler disindaki herseyi silin.
        // cevap asagida...
        String input = "    Java ogrenmek123 cok guzel@   ";
























        String input2="";
        String input3="";


        input2 = input.trim().replaceAll("\\d","").replaceAll("@","");
        input3 = input2.substring(0,1).toUpperCase()+input2.substring(1).toLowerCase();
        System.out.println(input3);
    }
}
