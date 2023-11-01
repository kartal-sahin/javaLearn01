package J08_Loops.Tasks;

import java.util.Scanner;

public class Task16 {

    /*
     task-> Girilen sayının asal olmasını kontrol eden code create ediniz.
     * */
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("bir bir sayi girin");
        int sayi=input.nextInt();
        int bolenSayisi=0;
        for(int i=2; i<sayi; i++) {
            //if(sayi % i == 0 ){
             //   bolenSayisi++;
           // }
           bolenSayisi=(sayi % i == 0)? bolenSayisi++: bolenSayisi;

        }
        System.out.println((bolenSayisi == 0 ? "girilen sayi ASal" : "Asal degil"));


    }
}
