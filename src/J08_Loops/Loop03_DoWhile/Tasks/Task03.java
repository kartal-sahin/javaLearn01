package J08_Loops.Loop03_DoWhile.Tasks;

import java.util.Scanner;

public class Task03 {

    public static void main(String[] args) { /*
    Task-> Girilen bir pozitif tamsayının tam kare olmasını kontrol eden code create ediniz.

     Ornek :  input : 16, output: 4 */
        Scanner input=new Scanner(System.in);


        do {
            System.out.println("Lutfen pozitif bir tamsayi giriniz  :");
            int sayi=Math.abs(input.nextInt());
            if(sayi==Math.sqrt(sayi)*Math.sqrt(sayi)) {
                System.out.println(sayi + " tam kare sayidir  "+Math.sqrt(sayi)+" nin karesidir");

                break;
            }

        }while (0==0);










    }
}
