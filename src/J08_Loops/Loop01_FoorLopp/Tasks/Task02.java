package J08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        /* task-> interview question
        girilen ifadenin polindrome olmasını kontrol eden code create ediniz...
        plindrome:her iki yönde okundugunda eşit olan ifadeler :ece, ada etc.

         */
        Scanner input=new Scanner(System.in);
        System.out.println("bir ifade giriniz");
        String kelime= input.nextLine();
        String tersKelime="";
        for (int i = kelime.length()-1; i >=0 ; i--) {
            tersKelime += kelime.charAt(i);
        }

        if (kelime.equals("tersKelime")) {
                System.out.println("polidrom");
        } else {
                System.out.println("polidrom degil");
        }


    }

}
