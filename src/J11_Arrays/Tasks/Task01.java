package J11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //Task-> girilen bir int array elemanlarını buyukten kucuge   print eden code create ediniz.
        Scanner  input=new Scanner(System.in);
        System.out.println("array kac elamanli olsun");
        int elemanSayisi= input.nextInt();
        int arr[]=new int[elemanSayisi];


        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+".elemani giriniz");
            arr[i]=input.nextInt();

        }
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {

            System.out.print(arr[i]+"  ");
        }

    }
}
