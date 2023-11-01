package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        //task-> girilen iki sayının eşitliğini control eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1=input.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2=input.nextInt();
        System.out.println(estlikKokntrol(sayi1, sayi2));


    }//main sonu

    private static String estlikKokntrol(int sayi1, int sayi2) {
        return  (sayi1==sayi2 ? "sayilar esittir" :"sayilar esit degil");
    }


}//class sonu
