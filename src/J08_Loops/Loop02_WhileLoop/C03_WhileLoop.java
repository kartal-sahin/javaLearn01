package J08_Loops.Loop02_WhileLoop;

import java.util.Scanner;

public class C03_WhileLoop {
    public static void main(String[] args) {
        // task-> girilen tamsayının pozitif tam bolen sayısını print eden code create ediniz...
// 20 -> 1,2,4,5,10,20: 20'nin 6 tane tam böleni var
// 30 -> 1,2,3,5,6,10,15,30: 30'un 8 tane tam böleni var
        Scanner scanner = new Scanner(System.in);
        System.out.println("lutfen bir sayi yaziniz :");
        int sayi = scanner.nextInt();
        int bolSayi = 0;
        int tamBolen = 1;
        while (tamBolen <= sayi) {

                    if(sayi%tamBolen==0){
                        bolSayi++;


                    }

            tamBolen++;


       }
         System.out.println(bolSayi);




    }






}
