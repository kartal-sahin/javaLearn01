package J05_ifStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _03_if_Statement {
    public static void main(String[] args) {
          /*    str1 ve str2 isimli 2 tane String oluşturulmuştur.
          Eğer str1, str2'ye eşit ise "String 1 is equal to String 2" yazdırınız.
          Eğer str1, str2'ye eşit değil ise "String 1 is NOT equal to String 2" yazdırınız. */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen birinci string yaziniz");
        String str1 = scan.nextLine();
        System.out.println("lutfen ikinci string yaziniz");
        String str2 = scan.nextLine();


        if (str1.equalsIgnoreCase("str2")){
            System.out.println("String 1 is equal to String 2");
        }else{
            System.out.println("String 1 is NOT equal to String ");
        }

    }
}
