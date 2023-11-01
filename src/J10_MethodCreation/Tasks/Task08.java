package J10_MethodCreation.Tasks;

import java.time.LocalDate;
import java.util.Scanner;

public class Task08 {

    public static void main(String[] args) {
        /*girilen bir yılın artık (LEAP YEAR) olmasını kontrol eden code create ediniz..
        artık yıl:
        Kural1: 4 ile bölünemeyen yıllar artık yıl değildir.
        Kural2: 4 ile bölünüp 100 ile bölünemeyen yıllar artık yıldır.
                Kural3: 4’ün katı olmasına rağmen 100 ile bölünebilen yıllardan sadece  400’ün katı olan yıllar artık yıldır.


    Task-> girilen bir yılın  artık yıl olmasını kontrol eden METHOD create ediniz

   input: 2023
   output:false
    */
        Scanner input = new Scanner(System.in);
        System.out.println("yilinizi giriniz");
        int yil=input.nextInt();
        System.out.println(leapYearControl(yil));
        System.out.println(leapYearControl1(yil));
        System.out.println(leapYearControl1(1985));


    }//main sonu

    private static String leapYearControl(int yil) {
        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)? "true":"false";
    }
    private static String leapYearControl1(int yil) {
        return (yil % 4 == 0 && yil % 100 != 0) || (yil % 400 == 0)? "true":"false";
    }
}//Class sonu
