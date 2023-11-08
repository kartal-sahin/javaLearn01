package J12_ArraysList.Tasks;

import java.util.ArrayList;
import java.util.Arrays;
import java.util.List;
import java.util.Scanner;

public class Task03 {
    public static void main(String[] args) {

        // Task ->  bir listte istenen sayının varlığı kontrol eden code create ediniz.
        Scanner scan=new Scanner(System.in);
        System.out.println("hangi sayiyi kontrol etmek istiyorsunuz  :  ");
        int sayiKontrol=scan.nextInt();
        List<Integer> sayi = new ArrayList<>(Arrays.asList(1,2,3,4,5,6,7,8,9,10,11,12,13,14,15,16));
        boolean kontrol=false;
        for (int i = 0; i <sayi.size() ; i++) {
            if(sayi.get(i)==sayiKontrol){
                kontrol=true;
                break;
            }

        }
        System.out.println(kontrol ? "evvet vardir ha" : "ma yoktur");



    }
}
