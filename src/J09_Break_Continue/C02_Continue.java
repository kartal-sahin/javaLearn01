package J09_Break_Continue;

import java.util.Scanner;

public class C02_Continue {
    public static void main(String[] args) {
        /*
Program, bir loop içerisinde continue komutu ile karşılaşılırsa, ondan sonraki komutları
atlar ve loop'un bir sonraki değerinden devam eder.
*/

// Task-> girilen bir mail hesabındaki ' ' karakterlerini handle ederek print eden code cerate ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("mailinizi giriniz");
        String mail= input.nextLine();
        String newMail="";
        for (int i = 0; i <mail.length() ; i++) {
            if(mail.charAt(i) == ' '){
                continue;
            }
            newMail+=mail.charAt(i);

        }
        System.out.println("newMail = " + newMail);


    }
}
