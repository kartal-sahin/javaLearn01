package J05_ifStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _06_if_statement {
    public static void main(String[] args) {
              /*      8. satırda int number oluşturulmuştur.
                Eğer int number 0 yazdırılırsa "Im neutral",
                Eğer int number 0'dan büyükse "I m positive",
                Eğer int number 0'dan küçükse "I am negative" yazdırılsın.   */

        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir numara yaziniz");
        int number = scan.nextInt();
        if(number == 0){
            System.out.println("I am neutral");

        }else if(number>0){
            System.out.println("I am positive");

        }else{
            System.out.println("I am negative");
        }



    }
}
