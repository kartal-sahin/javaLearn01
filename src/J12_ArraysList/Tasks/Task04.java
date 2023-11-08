package J12_ArraysList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;

public class Task04 {
    public static void main(String[] args) {
        /* TASK :

         * Input olarak verilen listteki isimlerden
         * icinde ‘a’ ve 'A'  harfi bulunanlari silen bir code create ediniz.
         *
         * INPUT : list1={"Ali","Veli","Ayse","Fatma","Omer"}
         * OUTPUT : [Veli,Omer]
         */
        List<String> list1 = new ArrayList<String>(Arrays.asList("Ali","Veli","Ayse","Fatma","Omer"));
        //list1.remove(list1.get(1));

      //  System.out.println(list1);

       // for (int i = 0; i < list1.size() ; i++) {
      //      if(list1.get(i).contains("A") ){
     //           list1.remove(i);
     //           if(list1.get(i).contains("a")){
     //               list1.remove(i);
     //}

      //  System.out.println(list1);
        List<String> newList = new ArrayList<>();
        for (String item : list1) {
            if (!item.contains("a") &&!item.contains("A")) {
                newList.add(item);
            }
        }
        System.out.println(newList);
    }
}
