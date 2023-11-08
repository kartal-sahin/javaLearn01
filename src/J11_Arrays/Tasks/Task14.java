package J11_Arrays.Tasks;

import java.util.Arrays;

public class Task14 {
    public static void main(String[] args) {
        /*  TASK :
        Write a method which accepts  string as parameter and prints the sum of digits
        present in thr given string
         verilen Stringde bulunan rakamların toplamını print eden parametreli METHOD create ediniz.
        input :"ade1r4d3"
        output : 8
        trick : Use --> Character.isDigit()
                    --> Integer.valueOf()
         */

        String str = "ade1r4d3";
        System.out.println(toplam(str));
    }

    private static int toplam(String str) {
        String str1=str.replaceAll("\\D", "");
        String arr[]=str1.split("");
        System.out.println(Arrays.toString(arr));
        int sum=0;
        for (int i = 0; i < arr.length ; i++) {
            sum+=Integer.valueOf(arr[i]);

        }return sum;
    }


}

