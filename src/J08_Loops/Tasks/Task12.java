package J08_Loops.Tasks;

import java.util.Scanner;

public class Task12 {
    public static void main(String[] args) {
        /*
        Task -> girilen 5 sayının 10 ile 20 arası hariç diğerlerinin
        toplamının print eden code create ediniz
         */
        Scanner input=new Scanner(System.in);
        int toplam=0;
        for (int i = 1; i <6 ; i++) {
            System.out.println( i +". sayi girin");
            int sayi=input.nextInt();
           // if(sayi<=10 || sayi>=20){
             //   toplam+=sayi;
            //}
            toplam=sayi<=10 || sayi>=20?toplam+=sayi:toplam;


        } System.out.println("girilrn sayilarin toplami  :" + toplam);




    }
}
