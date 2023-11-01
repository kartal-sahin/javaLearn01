package J07_StringManipulation;

import java.util.Scanner;

public class C07_StringManipulation {
    public static void main(String[] args) {
     /*
 String IsEmpty
  String tamamen boş mu değil mi onu kontrol ediyor, sonuç true false return eder
 isEmpty Methodundan true aliyorsaniz o String'in icinde hic bir character yok demektir.
 Yani o String'in length() 0 demektir.
 length()==0 demek isEmpty() true verir demektir.
*/

        String str="madem geldin";
        System.out.println(str.isEmpty());
        System.out.println(str.length());
        String str1="";
        System.out.println(str1.isEmpty());
        String str3=null;
        System.out.println(str3.isBlank());


    }
}
