package J05_ifStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task05 {
    public static void main(String[] args) {
        /* Task->
		 Girilen bir sayı için
		 sayi 3 basamakli ise console ' a "3 basamakli"
		 sayi 2 basamakli ise console'a "2 basamakli"
		 sayi 3 basamakli yada 2 basamakli degilse "ikisi de degil"  print eden code create ediniz
		 */
        Scanner scan = new Scanner(System.in);
        System.out.print("sayi giriniz    :" );
        int sayi = scan.nextInt();
        sayi=Math.abs(sayi);//mutlak deger

        if(sayi<1000&&sayi>99){
            System.out.println("3 basamakli");
        }else if(sayi<100&&sayi>9){
            System.out.println("2 basamakli");
        }else{
            System.out.println("ikisi de degil");
        }

    }
}
