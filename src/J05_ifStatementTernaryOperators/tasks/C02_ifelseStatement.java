package J05_ifStatementTernaryOperators.tasks;

import java.util.Scanner;
// girilen sayinin 18 den buyuk olup-olmadigini inceleyeniz
public class C02_ifelseStatement {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Bir sayi giriniz  :");
        int sayi=input.nextInt();
        if (sayi>18){
            System.out.println("Girilen sayi 18 den büyük");
        }else if(sayi==18){
            System.out.println("Girilen sayi 18");
        }else{
            System.out.println("Girilen sayi 18 den küçük");
        }



    }
}
