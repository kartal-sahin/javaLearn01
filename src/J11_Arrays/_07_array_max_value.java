package J11_Arrays;

import java.util.Arrays;

public class _07_array_max_value {

    public static void main(String[] args) {

        /*
            int Array oluşturun ve elemanları : 12,2,5,15,8
            En büyük değeri yazdırınız.
         */

        // code start here
        int numArr[]={12,2,25,15,8};
        int enbSayi=0;
        //Arrays.sort(numArr);
        for (int i = 0; i <numArr.length ; i++) {
            if(numArr[i] > enbSayi){
                enbSayi=numArr[i];
            }
        }
        System.out.println("en buyuk Sayi = " + enbSayi);  int enb=0;
    /*    for (int i = 0; i <numArr.length ; i++) {
            Math.min(numArr[i], enb);
            enb=numArr[i];


        }
        System.out.println(enb);

     */


    }
}

