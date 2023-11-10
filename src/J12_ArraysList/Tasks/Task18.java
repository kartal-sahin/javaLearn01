package J12_ArraysList.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task18 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        /* Task->  Verilen bir listede, istenen iki index'deki elementlerin yerini
         kalici olarak degistiren bir method create ediniz

         */

        List<Integer> sayilar = new ArrayList<>();
        sayilar.add(1);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(3);
        sayilar.add(5);
        sayilar.add(6);
        sayilar.add(1);
        sayilar.add(7);
        System.out.println(sayilar);
        System.out.println(indexChanged(sayilar));
    }

    private static List indexChanged(List<Integer> sayilar) {
        System.out.println("degistermek istediginiz 1. indexi giriniz  :");
        int index1= scan.nextInt();
        System.out.println("hangi index ile degistermek degistirmek istiyorsunuz  :");
        int index2= scan.nextInt();
        int deg=sayilar.get(index1);
        sayilar.set(index1, sayilar.get(index2));
        sayilar.set(index2, deg);

        return sayilar;

    }


}
