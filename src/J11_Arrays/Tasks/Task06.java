package J11_Arrays.Tasks;

import java.util.Arrays;

public class Task06 {
    public static void main(String[] args) {
        // Task-> verilen bir int arrayi elemanlarını buyukten kucuge siralayip return eden METHOD create ediniz
        int arr[] = {21, 52, 14, 63, 49, 31, 35, 53, 26};
        siralama(arr);
    }

    private static void siralama(int[] arr) {
        Arrays.sort(arr);
        for (int i = arr.length-1; i >=0 ; i--) {

            System.out.print(arr[i]+"  ");
        }

    }
}
