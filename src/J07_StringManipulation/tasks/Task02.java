package J07_StringManipulation.tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /*  Task->
		 	Girilen passwordun aşagıdaki şartları sağlamasını kontrol eden coden create ediniz
		 	 a)Ilk karakteri buyuk harf olmalı
		 	 b)Son karakteri sayi olamlı
		 	 c)en az 6 karakter uzunlugunda olmalı

         */



        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir şifre giriniz");
        String password = scanner.nextLine();
        Character sonk = password.charAt(password.length() - 1);
        Character ilkK = password.charAt(0);

        if(password.length()>=6){
            System.out.println("ilk adim basarili en az 6 karakter uzunlugunda ");
            if(Character.isUpperCase(ilkK)){
                System.out.println("ikinci adim basarili ilk karakteri buyuk harf ");
                if (Character.isDigit(sonk) ) {
                    System.out.println("ucuncu adim basarili son karakter sayi ");
                    System.out.println("Sisteme giris basarili");

                }else{
                    System.out.println("son karakter sayi olamali,lutfen tekrar giris yapiniz");
                }



            }else{
                System.out.println("ilk karakter buyuk harf olamali,lutfen tekrar giris yapiniz");
            }

        }else{
            System.out.println("en az alti karakter olmali");
        }


        //System.out.println(password.charAt(password.length() - 1));


        //System.out.println(password.substring(0, 1));


       /*
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen pasword giriniz");
        String pasword = input.next();


        if (pasword.length()>6&Character.isDigit(sonk)&&){
            System.out.println("Sisteme giris basarili");
        }else System.out.println("Sifre en az 6 karakter icermelidir, Ilk karakter Buyuk harf olmali ve son karakter Rakam olmalidir");

        */


    }
}
