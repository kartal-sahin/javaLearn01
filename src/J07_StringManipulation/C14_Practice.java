package J07_StringManipulation;

import java.util.Scanner;

public class C14_Practice {
    public static void main(String[] args) {
        /*Task-> Girilen ir String'deki bir karakterin tekrarlı veya tekrarsız
  olmasını kontrol eden code create ediniz
Ör: Helloooo==> H-> Tekrarsız     e-->Tekrarsız   l--> Tekrarlı   o-->Tekrarlı
 */
        Scanner input=new Scanner(System.in);
        System.out.println("bir kelime yaziniz  :");
        String kelime=input.nextLine();
        System.out.println("istedigin karakteri gir");
        char c=input.next().charAt(0);
        if(kelime.indexOf(c)==kelime.lastIndexOf(c)){
            System.out.println("tekrarsiz");
        }else{
            System.out.println("tekrali");

        }






    }
}
