package J07_StringManipulation.tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
       /*  TASK :
        Kullanıcıdan alacağınız, 3 kelimelik  ismi
         Örn. Haluk Bilgin Java -> H.B.J.  şeklinde print eden code create ediniz.
        */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad Soyadı Giriniz");
        String adSoyad = scanner.nextLine().toUpperCase();
        char ad1=adSoyad.charAt(0);
        char ad2=adSoyad.substring(adSoyad.indexOf(" ") + 1).charAt(0);
        char soyad=adSoyad.substring(adSoyad.lastIndexOf(" ") + 1).charAt(0);
        if(adSoyad.contains(" ")&& adSoyad.charAt(0)!= ' '){

            System.out.println(ad1+"." +ad2+"." +soyad+".");

        }else {
            System.out.println("ad ile soyad arasina bosluk giriniz");
        }




    }
}
