package J11_Arrays;

import java.util.Arrays;

public class _16_Advance_Array_get_sum {

    public static void main(String[] args) {

        /*
        Bu şekilde bir String oluşturunuz.  "$12 $23 $10 $2 $5 $2"
        $ işaretlerini kaldırın ve sayıları toplayın.
        Sayıların toplamını yazdırın.
         */

        //Kodu aşağıya yazınız.
        int toplam=0;
        String str="$12 $23 $10 $2 $5 $2";
        String str1=str.replace("$","");
        System.out.println(str1);
        String num[]=str1.split(" ");
        System.out.println(Arrays.toString(num));

        for (int i = 0; i < num.length ; i++) {
            toplam+=Integer.valueOf(num[i]);

        }
        System.out.println("toplam = " + toplam);


    }
}