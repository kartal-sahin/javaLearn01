package J11_Arrays;

import java.util.Arrays;

public class C02_ArraysPractice {
    public static void main(String[] args) {
        String[] isimArr = {"Muhammed", "Sebnem", "Musa", "Ayse", "Sennur", "Recep"};
        int sayiArr[] = {20, 32, 7, 58, 63, 59, 35, 17, 16, 21};
         //Task01-> sayıArr cift index elemanlarını print eden code create ediniz
        /*for (int i = 0; i <sayiArr.length ; i++) {
            if(i%2==0){
                System.out.print(i+". index eleman  "+sayiArr[i]+" :");
            }

        }
        //for (int i = 0; i< sayiArr.length ; i+=2) {
        //    System.out.println(sayiArr[i]);
        //}

         */

       //task 02-> isimArray de 5 karakterden fazla olan elewmanlari print eden code create ediniz.

        //for (int i = 0; i < isimArr.length; i++) {
        //    if(isimArr[i].length()>5){
        //        System.out.print(isimArr[i]+" ");
        //    }
        //}
        //Task 03->isimArray de 6 karakterden az olan elemanı saklayan arrayı print eden code create ediniz..
        int count=0;


        for (int i = 0; i < isimArr.length; i++) {
            if(isimArr[i].length()<6){
                count++;

            }


        }
        String yeniArray[]=new String[count];
        int yeniIndex=0;
        for (int i = 0; i < isimArr.length; i++) {
            if (isimArr[i].length() < 6) {
                yeniArray[yeniIndex] = isimArr[i];
                yeniIndex++;

            }

        }System.out.println(Arrays.toString(yeniArray));


        }
}
