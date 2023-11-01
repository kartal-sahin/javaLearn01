package J08_Loops.Loop03_DoWhile.Tasks;

import java.util.Scanner;

public class TAsk01 {
    public static void main(String[] args) {
        //girilen sayi 0 olmadigi muddetce girilen sayilarin toplamini print eden create eden kodeu yaziniz
        Scanner input=new Scanner(System.in);
        int toplam=0;
        int sayi;
        do {
            System.out.println("bir sayi giriniz");
            sayi= input.nextInt();
            toplam+=sayi;
        }while (sayi!=0);
        System.out.println("sayi = " + toplam);
    }
}
