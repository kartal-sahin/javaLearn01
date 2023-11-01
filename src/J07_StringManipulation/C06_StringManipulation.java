package J07_StringManipulation;

import java.util.Scanner;

public class C06_StringManipulation {
    public static void main(String[] args) {

        String str ="maden geldik dunyaya otur calis javaya";
        System.out.println(str.substring(str.length() - 10));
        System.out.println(str.substring(0, 1)+str.substring(str.length()-1));

        Scanner input=new Scanner(System.in);
        System.out.println("lutfen dort harfli bir kelime giriniz  :");
        String kelime=input.next();
        //(kelime.substring((3,4)+kelime.substring((2,3)+kelime.substring((1,2)+kelime.substring((0,1)).






    }
}
