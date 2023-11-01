package J05_ifStatementTernaryOperators;

import java.util.Scanner;

public class C03_TernaryOperator {
    public static void main(String[] args) {
        /*
Ternary ile yapılan tum actionlar if-else blok ile de yapılır.
Ternary blok code daha clean daha okunabilir ve anlaşılabilir olması için tercih edilir
Ternary blok içinde komplex code yerine daha basic ve doğrudan sonuç üreten code'lar bulunur
 */
        // Task01-> girilen bir tamsayının  tek-çift olmasını kontrol eden code create ediniz.
       /* Scanner input=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi= input.nextInt();
        String sayi1=( sayi%2==0 ?  "sayi cift sayidir" :"sayi tek sayidir");
        System.out.println( sayi1);

        */
        System.out.println("***task2**** ");;
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi1= input.nextInt();
        System.out.println("lutfen birinci sayiyi giriniz");
        int sayi2= input.nextInt();
        /*String sonuc2=(sayi>0?"pozitif":"pozitif degil");
        System.out.println(sonuc2);


        if(sayi>0){
            System.out.println("pozitif");
        }else{
            System.out.println("pozitif degil");

        }

         */

        // Task04-> girilen iki tamsayının işaretleri farklı ise toplamını değilse "agam DEWAMKEEE" print eden code create ediniz.
        System.out.println("   ***  task04   ***   ");
        String sonuc12= String.valueOf(((sayi1*sayi2<0)?"toplam ="+(sayi1+sayi2): "agam devamke"));
        System.out.println(sonuc12);


    }
}
