package J05_ifStatementTernaryOperators;

import java.util.Scanner;

public class C05_TernaryOperator {
    public static void main(String[] args) {
        // Task-> girilen bir tamsayının ciftse yarısını  değilse "agıdeşşş tek'in yarısı tam olmazzz" print eden code create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi23= input.nextInt();
        Object sonuc=(sayi23%2==0?sayi23/2:"tek sayinin yarisi olmaz");
        System.out.println(sonuc);


    }




}
