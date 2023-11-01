package J08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C02_WhileLoop {
    public static void main(String[] args) {
        Scanner scanner=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz");
        int sayi=scanner.nextInt();
        int sayiToplam=0;
        while (sayi>0){
            sayiToplam+=sayi%10;
            sayi=sayi/10;
        }
        System.out.println(sayiToplam);
    }
    //girilen tam sayinin rakamlari toplamini print eden code crate ediniz.





}
