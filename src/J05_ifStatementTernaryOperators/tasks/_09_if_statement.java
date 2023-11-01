package J05_ifStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _09_if_statement {
    public static void main(String[] args) {

      /* str bir String'dir.
        Eğer String Orange'ye eşit ise ve uzunluğu 6'ya eşit ise "Orange has six letters" yazdırınız.
        Eğer String Apple'ye eşit ise ve uzunluğu 5'ya eşit ise "Apple has five letters" yazdırınız.
        Eğer String Orange'yi kapsıyorsa ve uzunluğu 10'dan fazla ise
        "String contain orange and length is more then 10" yazdırınız.
        Not: Uzunluk derken ingilizcedeki "length" yani karakter sayısından bahsediliyor.  */

        Scanner scan = new Scanner(System.in);
        System.out.println("Lutfen bir string yaziniz");
        String str = scan.nextLine();
        /*String meyve1="Orange";
        String meyve2="Apple";
        if (str.equalsIgnoreCase(meyve1)&& str.length()==meyve1.length()){
            System.out.println("Orange has six letters");
        }else if(str.equalsIgnoreCase(meyve2)&& str.length()==meyve2.length()){
            System.out.println("Apple has five letters");
        }else if(str.contains(meyve1)&& str.length()>10){
            System.out.println("String contain orange and length is more then 10");
        }

         */
        /*
            String str = "Orange";
            if (str.equals("Orange") && str.length() == 6) {
                System.out.println("Orange has six letters");
            } else if (str.equals("Apple") && str.length() == 5) {
                System.out.println("Apple has five letters");
            } else if (str.contains("Orange") && str.length() > 10) {
                System.out.println("String contains orange and length is more than 10");
            }

         */




        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
    }
}
