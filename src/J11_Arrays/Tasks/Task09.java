package J11_Arrays.Tasks;

import java.util.Scanner;

public class Task09 {
    public static void main(String[] args) {
        // Task -> Girilen 5 sayıyı , giriş sırasına göre tersten print eden code create ediniz
        Scanner input=new Scanner(System.in);
        int arr[]=new int[5];
        for (int i = 0; i < arr.length ; i++) {
            System.out.println(i + ".elemani giriniz");
            arr[i] = input.nextInt();
        }
        for (int i = arr.length-1; i >=0; i--) {

            System.out.print(arr[i]+" ");
        }



    }
}
