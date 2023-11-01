package J08_Loops;

import java.util.Scanner;

public class task07 {
    public static void main(String[] args) {
        //girilen 5 sayinin en buyugunu print eden kodu create yaziniz
        Scanner input=new Scanner(System.in);
        int basla=1;
        int enbSayi=0;
        while(basla<=5){
            System.out.print(basla+". sayiyi giriniz  :");
            int sayi=input.nextInt();
            enbSayi=Math.max(enbSayi,sayi);
            basla++;


        }
        System.out.println("enbSayi = " + enbSayi);
    }
}
