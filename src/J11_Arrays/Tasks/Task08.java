package J11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task08 {
    public static void main(String[] args) {
        //Task-> girilen 7 elemanlı bir int  arrayın tek elemanlarını print eden code create ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("array kac elamanli olsun");
        int elemanSayisi= input.nextInt();
        int arr[]=new int[elemanSayisi];

        String toplam="";
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + ".elemani giriniz");
            arr[i] = input.nextInt();
        }
        for (int i = 0; i <arr.length; i++) {
            if(arr[i]%2==1){
                System.out.print(String.valueOf(arr[i]+" "));
            }

        }



    }
}
