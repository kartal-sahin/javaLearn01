package J05_ifStatementTernaryOperators;

import java.util.Scanner;

public class C04_TernaryOperator {
    public static void main(String[] args) {
        // Task -> girilen bir tamsayının 2 veya daha fazla basamaklı olmasını kontrol eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= input.nextInt();
      String sonuc=((sayi>10 ||sayi<-9)?"2 basmak ve daha fazla":"2 basamktan daha az");
        System.out.println(sonuc);


    }
}
