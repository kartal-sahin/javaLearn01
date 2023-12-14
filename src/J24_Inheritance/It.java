package J24_Inheritance;

import java.util.Scanner;

public class It {//POJO
    String ad;
  String soyad;
  String yas;

   public static String adSoyadYas(){
        Scanner scan=new Scanner(System.in);
        System.out.println("ogrencinin adini giriniz");
        String ad= scan.nextLine();

        System.out.println("ogrencinin soyadini giriniz");
        String soyad= scan.nextLine();

        System.out.println("ogrencinin yasini giriniz");
       String yas= scan.next();

       return ad;

   }
}
