package J08_Loops.Loop01_FoorLopp.Tasks;

import java.util.Scanner;

public class Task04 {

    public static void main(String[] args) {
// task-> girilen iki tamsayı arasındaki çift sayıları print eden code create ediniz...
        Scanner input=new Scanner(System.in);
        System.out.println("birinci tam sayiyi giriniz");
        int num1=input.nextInt();
        System.out.println("ikinci tam sayiyi giriniz");
        int num2=input.nextInt();
        for (int i = (num1<num2?num1:num2); i <(num1>num2?num1:num2) ; i++) {
            System.out.print(i % 2 == 0 ? i+" " : "");

        }


    }
}
