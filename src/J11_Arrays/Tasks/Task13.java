package J11_Arrays.Tasks;

import java.util.Scanner;

public class Task13 {

    public static void main(String[] args) {
        /* TASK :
        Girilen 8 elemanli arrayin icinde
        3 e bolunebilen sayi adedini print eden  code create ediniz (negatif sayilar dahil )

         */

        int[] arr = new int[8];
        Scanner scan = new Scanner(System.in);
        int count=0;
        for (int i = 0; i <8 ; i++) {
            System.out.print( i+ ".  sayiyi giriniz = ");
            arr[i]=scan.nextInt();
        }
        for (int i = 0; i <8 ; i++) {
            if(arr[i]%3==0) {
                count++;
            }

        }
        System.out.println("uce bolunebilen sayi = " +count);


    }

}
