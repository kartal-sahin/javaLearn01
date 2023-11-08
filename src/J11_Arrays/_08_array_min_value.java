package J11_Arrays;

import java.util.Arrays;

public class _08_array_min_value {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 14 , 19 , 5 , 21
        En küçük (minimum) sayıyı yazdırınız.
         */

        // Kodu aşağıya yazınız..
        int numArr[] = {14, 19, 5, 21};
        Arrays.sort(numArr);
        System.out.println("en kucuk sayi = " + numArr[0]);
    }
}

