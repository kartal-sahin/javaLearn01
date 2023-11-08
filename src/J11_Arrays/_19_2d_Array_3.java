package J11_Arrays;

import java.util.Arrays;

public class _19_2d_Array_3 {

    public static void main(String[] args) {

        /*
        Aşağıdaki gibi olan bir 2D String Array oluşturunuz.
        [{"new jersey","atlanta","ohio"} ,
        {"Pittsburgh" ,"ohio","new york","ohio"} ,
        {"ohio","new york"}]
        Bütün ohio'ları Florida'yla değiştiriniz.
        Array'i yazdırınız.

         */
        String ulkeArr[][]={{"new jersey","atlanta","ohio"} ,
                {"Pittsburgh" ,"ohio","new york","ohio"} ,
                {"ohio","new york"}};
        for (int i = 0; i < ulkeArr.length ; i++) {
            for (int j = 0; j <ulkeArr[i].length ; j++) {
                if(ulkeArr[i][j].equalsIgnoreCase("ohio")){
                    ulkeArr[i][j]="Florida";

                }
            }

        }System.out.println(Arrays.deepToString(ulkeArr));






    }
}

