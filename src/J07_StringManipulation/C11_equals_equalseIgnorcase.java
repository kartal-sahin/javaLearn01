package J07_StringManipulation;

import java.util.Scanner;

public class C11_equals_equalseIgnorcase {
    public static void main(String[] args) {
/* equals()
 * 2 String metnin birbirine esit olup olmadigina bakar. büyük küçük harf farkı vardır. Sonuc boolean dir.
 *
 *  equals() method'u verilen iki String'in içeriğinin birbirine eşit olup olmadığını kontrol eder.
 * == karşılaştırma operatörü ise verilen iki String objesinin değerinin yanında reference(adres)'lerine de bakar.
 * Aynı değere sahip olsa da farklı iki objeyi == ile karşılaştırdığımızda sonuç FALSE olur.

 * equalsIgnorecase()
 * equals() ile ayni islevi gorur, tek farki buyuk kucuk harfe duyarliligi yoktur. Sonuc boolen dir.

 */
       /* String str1="Mert";
        String str2="Mert";
        System.out.println(str1.equals(str2));
        System.out.println(str2.equals(str1));
        System.out.println(str1.equals("Mert"));
        System.out.println(str1.equalsIgnoreCase(str2));
        String str3= new String("Mert");

        */
        String s1 = "clarusway";// s1 String pool(string havuzundan aynı referans:adres'e sahip variable)->ön cep(stack memory)
        String s2 = "clarusway";// s2 String pool(string havuzundan aynı referans:adres'e sahip variable)->ön cep(stack memory)
        String s3=new String("clarusway");// String data type unique adres(refdrans) sahip obj.-> cüzdan(heap memory)
        String s4=new String("clarusway");// String data type unique adres(refdrans) sahip obj.-> cüzdan(heap memory)
        System.out.println(s1 == s2);
        System.out.println(s1.equals(s2));
        System.out.println(s3 == s4);
        System.out.println(s3.equals(s4));

        String sa="musa";
        String sb="";
        sb = sa+"";
        System.out.println(sb = sa + "");
        System.out.println(sa);
        System.out.println(sa == sb);


    }
}
