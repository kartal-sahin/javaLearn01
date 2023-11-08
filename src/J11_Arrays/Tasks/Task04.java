package J11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task04 {
    public static void main(String[] args) {
        // task-> girilen bir int array elamanlarından  ortlamadan buyuk olan eleman sayısını print eden code create ediniz
        Scanner  input=new Scanner(System.in);
        System.out.println("array kac elamanli olsun");
        int elemanSayisi= input.nextInt();
        int arr[]=new int[elemanSayisi];


        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i+".elemani giriniz");
            arr[i]=input.nextInt();

        }
        int toplam=0;
        for (int i = 0; i < elemanSayisi ; i++) {
            toplam+=arr[i];
        }
        int oratalama=toplam/ elemanSayisi;
        int count=0;
        for (int i = 0; i <elemanSayisi ; i++) {
            if(arr[i]>oratalama){
                count++;
            }

        }
        System.out.println(count);

    }

}
