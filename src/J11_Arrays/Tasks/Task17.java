package J11_Arrays.Tasks;

import java.util.Arrays;

public class Task17 {
    public static void main(String[] args) {
        // task-> asağıdaki sayi arr'deki en buyuk elemanı print eden code create ediniz...

        int arr[][]={
                {3,5},//0. kat
                {2,14,1},//1. kat
                {6,1,2,22},//2. kat
        };
        int enb=0;
        for(int i=0; i<=2; i++) {
            for (int j = 0; j < arr[i].length; j++) {
                if (arr[i][j] > enb) {
                    enb = arr[i][j];
                }

            }

        }
        System.out.println("enbuyuk sayi = " + enb);
    }
}
