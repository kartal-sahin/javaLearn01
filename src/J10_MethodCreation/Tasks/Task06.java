package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task06 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        //Task-> Girilen iki boyuta göre seçilen geometrik şeklin(kare dikdörtgen , üçgen) alan ve çevre değerlerini print eden METHOD  create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir yukseklik uzunlugu giriniz");
        int yukseklik= input.nextInt();
        System.out.println("Lutfen bir taban uzunlugu giriniz");
        int taban= input.nextInt();

        System.out.println(karedortgenAlan(yukseklik, taban));
        System.out.println(ucgenAlan(yukseklik, taban));
        System.out.println(karedortgenCevre(yukseklik, taban));
        System.out.println(ucgenCevre(yukseklik, taban));



    }//main sonu

    private static boolean ucgenCevre(int yukseklik, int taban) {
        return true;
    }

    private static double ucgenAlan(int yukseklik, int taban) {
        return ((yukseklik+taban)/2);
    }

    private static double karedortgenCevre(int yukseklik, int taban) {
        return (yukseklik+taban)*2;
    }

    private static double karedortgenAlan(int yukseklik, int taban) {
        return yukseklik*taban;
    }


}//Class sonu
