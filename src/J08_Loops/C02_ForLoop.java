package J08_Loops;

import java.util.Scanner;

public class C02_ForLoop {
    public static void main(String[] args) {
        //girilen sayidan 100 kadar olan 4 un kati olan tam sayilari yan yana print code create ediniz
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=input.nextInt();
        if(sayi<100) {
            for (int i = sayi; i < 100; i++) {
                if (i % 4 == 0) {
                    System.out.print(i + " ");

                }
            }
        }else {
            System.out.println("lutfen 100 den kucuk bir sayi giriniz");
        }

    }
}
