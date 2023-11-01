package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task05 {
    static Scanner input = new Scanner(System.in);//gunes eyledim ki herkeşler erişebile

    public static void main(String[] args) {
        // task-> girilen iki sayıyı seçilen dört işleme göre hesaplayıp print eden METHOD create ediniz
        Scanner input = new Scanner(System.in);
        System.out.println("1. sayiyi giriniz");
        int sayi1=input.nextInt();
        System.out.println("2. sayiyi giriniz");
        int sayi2=input.nextInt();
        System.out.println("islemini gir lutfen");
        char islem=input.next().charAt(0);
        dortIslem(islem,sayi1,sayi2);


    }//main sonu

    private static void dortIslem(char islem, int sayi1, int sayi2) {
        switch (islem){
            case '+':
                toplam(sayi1,sayi2);//System.out.println(sayi1 + " + " + sayi2 + " = " + (sayi1 + sayi2));
                break;
            case '-':
                cikar(sayi1,sayi2);//System.out.println(sayi1 + " - " + sayi2 + " = " + (sayi1 - sayi2));
                break;
            case '*' :
                carpim(sayi1,sayi2);//System.out.println(sayi1 + " * " + sayi2 + " = " + (sayi1 * sayi2));
                break;
            case '/' :
                bolme(sayi1,sayi2);//System.out.println(sayi1 + " / " + sayi2 + " = " + (sayi1 / sayi2));
                break;
            default:
                System.out.println("hatali islem sectiniz");
        }



    }

    private static void bolme(int sayi1, int sayi2) {
    }

    private static void carpim(int sayi1, int sayi2) {
    }

    private static void cikar(int sayi1, int sayi2) {
    }

    private static void toplam(int sayi1, int sayi2) {
    }


}//Class sonu
