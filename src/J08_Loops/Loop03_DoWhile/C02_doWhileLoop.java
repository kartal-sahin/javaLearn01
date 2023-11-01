package J08_Loops.Loop03_DoWhile;

import java.util.Scanner;

public class C02_doWhileLoop {
    public static void main(String[] args) {
        // task-> girilen 13 den kucuk ise "olaaa kazandınız :) " değilse saysı girişi isteyen code create ediniz...
        Scanner input=new Scanner(System.in);
        int sayi;
        do {
            System.out.println("bir sayi giriniz");
            sayi= input.nextInt();

        }while (sayi>=13);
        System.out.println("kazandiniz");


    }
}
