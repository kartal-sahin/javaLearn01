package J12_ArraysList.Tasks;

import java.util.ArrayList;
import java.util.Collections;
import java.util.List;

public class Task05 {
    public static void main(String[] args) {


         /*TASK :
        2 Boyutlu bir Multidimensional array i input kabul edip, arraydeki tüm elemanları bir
        listeye kopyalayan ve harf sırasına göre yazdıran bir METHOD yazınız.
        Ex : Input : {{Ali,Veli,Ayse},{Hasan,Can},{Suzan}}
           Output:[Ali, Ayse, Can, Hasan, Suzan, Veli]
         */
        String arrName[][] = {{"Ali", "Veli", "Ayse" }, {"Hasan", "Can" }, {"Suzan" }};
        System.out.println(nameSirali(arrName));


    }//main sonu

    private static List nameSirali(String[][] arrName) {
        List<String> nameList = new ArrayList<String>();
        for (int i = 0; i < arrName.length; i++) {
            for (int j = 0; j < arrName[i].length; j++) {
                nameList.add(arrName[i][j]);

            }

        }
        Collections.sort(nameList);

        return nameList;
    }
}
