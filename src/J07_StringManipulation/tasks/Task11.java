package J07_StringManipulation.tasks;

import java.util.Scanner;

public class Task11 {
    public static void main(String[] args) {
      /* TASK :
       Kullanıcıdan tek seferde alınan ad soyadı ifadeyi
      ad ve soyadı ayrı ayrı print eden code create ediniz
       */
        Scanner scanner = new Scanner(System.in);
        System.out.println("Ad Soyadı Giriniz");
        String adSoyad = scanner.nextLine();
        String ad1=adSoyad.substring(0, adSoyad.indexOf(" "));
        System.out.println("ad1 = " + ad1);
        String ad2=adSoyad.substring(adSoyad.indexOf(" ")+1,adSoyad.lastIndexOf(" "));
        System.out.println("ad2 = " + ad2);
        String ad3=adSoyad.substring(adSoyad.lastIndexOf(" ")+1);
        System.out.println("ad3 = " + ad3);



    }
}
