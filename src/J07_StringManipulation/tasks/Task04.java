package J07_StringManipulation.tasks;

import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {

        /*
         Task->
         Girilen iki kelimeden ilki çift sayıda karakter içeriyorsa 2. kelimeyi 1. kelimenin ortasına print eden
         ilk kelime tek sayıda karakter içeriyorsa "kelime2 kelime1 eklenemez" print eden code create ediniz
         name1= Java
         name2= haluk
         Print ==> Jahalukva
         */
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen name1 kelime giriniz");
        String name1 = input.next();
        System.out.println("Lutfen ikinci kelime giriniz");
        String name2 = input.next();
        int uzunluk=name1.length();

        if(uzunluk%2==0){
            System.out.println(name1.substring(0, uzunluk / 2) + name2 + name1.substring(uzunluk / 2  , name1.length()));


        }else{
            System.out.println(name2+" "+name1 +" eklenemez");
        }

















    }
}
