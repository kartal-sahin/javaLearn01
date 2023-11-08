package J11_Arrays;

import java.util.Arrays;
import java.util.Scanner;

public class _21_Array_reverse {

    public static void main(String[] args) {

        /*
        Girilen 123 Intiger'ının basamaklarını ters çevirin.
        Örnek:
        Input(girdi): 123
        Output(çıktı): 321
         */

        //Kodu aşağıya yazınız.
        Scanner scan=new Scanner(System.in);
        System.out.println("lutfen bir sayi giriniz:  ");
        int sayi1=scan.nextInt();

        String sayi2=String.valueOf(sayi1);
        String sayiArr[]= sayi2.split("");

        for (int i = sayiArr.length-1; i >=0 ; i--) {
            System.out.print(sayiArr[i]);

        }


    }
}


