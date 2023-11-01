package J05_ifStatementTernaryOperators;

import java.util.Scanner;

public class C06_NestedTernaryOperator {
    /*
 TASK :
 Girilen sayi 0 dan buyuk esit ise 10 dan kucukluğunu kontrol ediniz.
 10 dan kucuk ise  "Rakam" degilse "Pozitif Sayi" ,
 Sayi 0'dan kucuk ise  "Negatif Sayi" print eden code create ediniz
  */
    public static void main(String[] args) {
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir sayi giriniz");
        int sayi23= input.nextInt();
        String sonuc=(sayi23>=0?(sayi23<10?"rakam":"pozitif sayi"):("negatif sayi"));
        System.out.println(sonuc);
    }




}
