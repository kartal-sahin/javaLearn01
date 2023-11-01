package J07_StringManipulation;

import java.util.Scanner;

public class C04_Contains {
    public static void main(String[] args) {
        //string icerisinde istenen stringin varligini kontrol eder boolean return eder
        //String str="basari gayret asiktir";
        //System.out.println(str.contains("gay"));
       // //.out.println(str.contains("asiktir"));
        //System.out.println(str.contains("l"));
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir cumle giriniz");
        String str=scanner.nextLine();
        System.out.println("lutfen cumlede aradiginiz kelimeyi giriniz");
        String kelime=scanner.nextLine();
        //System.out.println(str.contains(kelime));
        System.out.println(str.contains(kelime) ? "MEVCUTTUR" : "DEegildir");


    }
}
