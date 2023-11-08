package J13_ForEachLoop;

import java.util.ArrayList;
import java.util.List;

public class C03_ {
    public static void main(String[] args) {
        String arr1[] = {"Abdullah", "Ferhat", "Sennur", "Sahin", "Ayse", "Can", "Burak" };
        String arr2[] = {"Sebnem", "Haluk", "Merve", "Sennur", "Ayse", "javaCAN", "javaSU" };
        List<String> ortakisimler=new ArrayList<>();
        for(String avuc1:arr1) {
            for(String avuc2:arr2) {
                if (avuc1.equals(avuc2)){
                    ortakisimler.add(avuc1);
                }
            }
        }
        System.out.println(ortakisimler);


    }
}
