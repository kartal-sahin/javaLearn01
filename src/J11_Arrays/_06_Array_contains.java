package J11_Arrays;

import java.util.Arrays;

public class _06_Array_contains {

    public static void main(String[] args) {

        /*
        String array oluşturun ve elemanları : Apple , Orange , Banana , Pineapple
        Apple elemanının bu Array'a ait olup olmadığını kontrol edin.
        Eğer aitse "true" çevirin.
        Loops (döngüler) kullanın.
         */

        //Kodu aşağıya yazınız..
        String arr[]={"Apple", "Orange" , "Banana", "Pineapple"};
        Arrays.sort(arr);
        boolean cevap=false;
        for (int i = 0; i < arr.length ; i++) {
            if(Arrays.binarySearch(arr, "Banana") >= 0){
                cevap = true;
            }else cevap=false;

        }
        System.out.println(cevap);
        System.out.println(Arrays.binarySearch(arr, "Banana"));


        //System.out.println(Arrays.binarySearch(arr, "Apple") >= 0 ? true : false);


    }
}
