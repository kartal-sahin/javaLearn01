package J08_Loops.Tasks;

import java.util.Scanner;

public class Task23 {
    public static void main(String[] args) {

    /*  task-> girilen tam sayıya kadar olan sayıların karelerinin toplamını
         print eden code create ediniz.


        Girilen sayı=4
        Kareler toplamı=30
     */
        Scanner input=new Scanner(System.in);
        System.out.println("bir bir sayi girin");
        int sayi=input.nextInt();
        int toplam=0;
        for (int i = 0; i <=sayi ; i++) {
            toplam+=i*i;


        }
        System.out.println(toplam);


    }
}
