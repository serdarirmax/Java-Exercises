package yapilanEgzersizler;

public class stringManipulations {
    public static void main(String[] args) {
        String name1 = "serdar";
        String name2 = "candan";

        if (name1.length()%2==0){
            int harfsayisi = (name1.length())/2;

            System.out.println(name1.substring(0,(harfsayisi))+name2+name1.substring(harfsayisi));
        } else if (name1.length()%2!=0) {
            System.out.println(name1 + ", cift say�l� harflerden olmad�ndan icine yerlestiremedik.");
        }


    }
}
