package string_manipulations_exercises;

public class StringKarakterSay {
    public static void main(String[] args) {
        //Kisi isimleri için 3 String değişken oluşturunuz. Boşluk karakterleri hariç 3 isimdeki
        //karakter sayısının toplamını yazdırınız.


























        String person1 = "Atilla Uzun";
        String person2 = "Derya Kazak";
        String person3 = "Esin Mavraci";
        String persons =person1+person2+person3;

        System.out.println(persons.replaceAll(" ","").length());



    }
}
