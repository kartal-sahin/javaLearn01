package J05_ifStatementTernaryOperators.tasks;

import java.util.Scanner;

public class _07_if_statement {
    public static void main(String[] args) {
        /*  int number 8. satırda.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit ise "number is a EVEN number" yazdırın.
     Eğer, int number ikiye bölündüğünde geri kalanı 0'a eşit değil ise "number is a ODD number" yazdırın.
*/
        Scanner scan = new Scanner(System.in);
        System.out.println("lutfen bir numara yaziniz");
        int number = scan.nextInt();

        if(number%2==0){
            System.out.println("number is a EVEN number");
        }else{
            System.out.println("number is a ODD number");
        }
        //Kodu aşağıya yazınız. BU SATIRIN YUKARISINI DEĞİŞTİRMEYİNİZ.
    }
}
