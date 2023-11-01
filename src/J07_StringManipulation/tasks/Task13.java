package J07_StringManipulation.tasks;

import java.util.Scanner;

public class Task13 {
    public static void main(String[] args) {

        //Task->  Girilen  String'deki space haric kac tane character kullanildigini print eden code create ediniz.
        Scanner input = new Scanner(System.in);
        System.out.println("lutfen bir cumle yaziniz  :");
        String str=input.nextLine().replace(" ","");
        int karakterStr=0;
        for(Integer i=0; i<str.length(); i++) {

            str.charAt(i);
            karakterStr++;
        }
        System.out.println("karakterStr = " + karakterStr);


    }
}
