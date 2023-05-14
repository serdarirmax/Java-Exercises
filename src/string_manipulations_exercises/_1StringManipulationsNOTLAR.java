package string_manipulations_exercises;

import java.util.Scanner;

public class _1StringManipulationsNOTLAR {
    public static void main(String[] args) {
        /*
        String Class Methodlari

        1)equals(): i)Iki tane String'in ayni olup olmadigini anlamamiza yarar.
        ii)equals() method'u "boolean" return eder.

        Note: String lerin esitliklerini kontrol ederken "==" yerine "equals()" methodu kullaniriz
        Neden kullaniriz?
        Cunku; "==" sembolu iki string i karsilastirirken hem adreslerine hemde degerlerine bakar,
        ikiside ayni ise stringler esittir de. ama biz code yazarken genellikle Stringlerin adressleri ile degil
        degerleri ile ilgileniriz. Bu yuzden String karsilastirmalarinda "==" kullanmayiz


        2)equalsIgnoreCase(): i) Iki tane String'in ayni olup olmadigini buyuk harf
        kucuk harfe dikkat etmeden anlamamiza yarar.
        ii) equalsIgnoreCase() method'u "boolean" return eder.

        3)toLowerCase(): i)Bir String'deki tum harfleri kucuk harfe cevirmek icin kullanilir.
        ii) toLowerCase() method'u "String" return eder

        4)toUpperCase(): i)Bir String'deki tum harfleri buyuk harfe cevirmek icin kullanilir.
        ii) toUpperCase() method'u "String" return eder

        5)charAt(): i) Bir String'den belli bir index'deki characteri almak icin kullanilir.
                ii) charAt() method'u "char" return eder.

        6)length(): i) Bir String'de kac tane character kullanildigini ogrenmek icin kullanilir
        ii) length() method'u "int" return eder.

        7)contains(): i)Bir String'de belli bir characterin veya
        characterlerin var olup olmadigini anlamak icin kullanilir
        ii) contains() method'u "boolean" return eder.

        8)split(): i)Bir String'i istedigimiz character'den parcalamaya yarar
        ii)split() method'u "Array" return eder.

        9)replace () i)Metin icerisindeki karakter ya da karakterlerin,
        istenilen karakter ya da metinle degistirilmesini saglar.
        ii) Sonuc String'dir..

        10)replaceFirst(): Replace ile aynı sadece ilk bulunan karakteri değiştirir.

        11)replaceAll("[0-9]",""): regex kullanarak string icindeki karakterleri veya karakter gruplarini manipule etmemizi saglar.

             Regular Expression(regex) : Belli turdeki characterleri secebilmemize yarar.

		 1) \\d    ==> tum rakamlar digit
		  	 \\D    ==> tum rakam disi character ler
		 2) \\w   ==> A->Z		a->z			0->9    _tum buyuk, kucuk harf ve rakamlar
		 	 \\W  ==> A->Z		a->z			0->9    _ disindaki hersey
		 3) \\s   ==> space tum bosluklar space
		 	 \\S   ==> space disindaki hersey


        Note: Bir grup datayi ifade etmek icin "Regular Expressions" Regex kullaniriz
        Note: Bir grup datayi degistirmek icin replaceAll() kullanilir

                        Meshur Regex
           1)Tum  rakamlar ==> [0-9]
           2)Tum kucuk harfler==> [a-z]
           3)Tum buyuk harfler==> [A-Z]
           4)Tum kucuk ve buyuk harfler==> [a-zA-Z]
           5)Tum harfler ve rakamlar ==>[a-zA-Z0-9]
           6)Tum noktalama isaretleri==>\\p{Punct}
           7)Tum sesli harfler ==> [aeiouAEIOU]
             Tum x,q,w harfleri     ==> [xqw]i

           8)Kucuk harflerden farkli tum characterler ==>[^a-z]
           9)Tum harflerden farkli tum characterler ==>  [^a-zA-Z]

        12) + Concat: Bir String'e diğerini ekler.
        Concatenation : Java'da + islemi yapilirken eger toplanan ifadelerden biri veya
         her ikisi String ise Java toplama degil BIRLESTIRME==YANYANA yazdirma yapar.

        13) indexOf('a'): 'a' karakterinin stringin ilk olarak kacinci indexinde oldugunu bulmamiza yarar.
            indexOf("Java") kullaniminda siz "Java" kelimesinin ilk gorunumundeki ilk harfin (yani J nin) index ini almis olursunuz
            indexOf() methodu olmayan characterler icin kullanilirsa her zaman -1 return eder
         ii) int doner.

        14) isBlank(): Stringin içinin bombos (space dahil) olup olmadiginin bilgisini verir
         ii) boolean doner.

        15) isEmpty(): Stringin içinin space hariç boş olup olmadiginin bilgisini verir
         ii) boolean doner.

        15)lastIndexOf('e') 'e' karakterinin stringin sondan baslayarak ilk olarak kacinci indexinde oldugunu bulmamiza yarar.
         ii) int doner.






*/


    }
}
