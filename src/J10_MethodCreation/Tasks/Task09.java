package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task09 {


    public static void main(String[] args) {

    /*
   Task->  Saati saniyeye çeviren  method create ediniz


    */

        Scanner input = new Scanner(System.in);
        System.out.println("Lutfen bir saat giriniz");
        int saat = input.nextInt();

        saatSaniyeye(saat);
        System.out.println("girilen  "+saat +"  saat  "+" = " +saatSaniyeye(saat) +" saniyedir");

    }//main sonu

    private static int saatSaniyeye(int saat) {
        return saat*3600;
    }



}// Class sonu
