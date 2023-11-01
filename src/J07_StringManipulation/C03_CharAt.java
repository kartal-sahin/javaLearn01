package J07_StringManipulation;

import java.util.Scanner;

public class C03_CharAt {
    public static void main(String[] args) {
         // GIRILEN STRING BIR ifadenin ortadaki karakteri print eden kodu create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen string bir ifade giriniz");
        String str=input.nextLine();
        if(str.length()%2==0){
            System.out.println("\"orta karakter yok\" = " + "orta karakter yok");
        }else {
            System.out.println("str.charAt((str.length())/2) = " + str.charAt((str.length()) / 2));
        }
        System.out.println(str.length());

    }

}
