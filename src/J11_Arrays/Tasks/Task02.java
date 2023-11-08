package J11_Arrays.Tasks;

import java.util.Arrays;
import java.util.Scanner;

public class Task02 {
    public static void main(String[] args) {
        //task-> girilen int array elemanları toplamını print eden code create ediniz.
        Scanner  input=new Scanner(System.in);
        System.out.println("array kac elamanli olsun");
        int elemanSayisi= input.nextInt();
        int arr[]=new int[elemanSayisi];

        int toplam=0;
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + ".elemani giriniz");
            arr[i] = input.nextInt();
            toplam += arr[i];
        }
        System.out.println(toplam);
    }
}
