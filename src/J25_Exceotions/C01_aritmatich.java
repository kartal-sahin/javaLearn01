package J25_Exceotions;

import java.util.Scanner;

public class C01_aritmatich {

    public static void main(String[] args) {
        Scanner scan=new Scanner(System.in);
        System.out.println("bir sayi giriniz :  ");
        int sayi1=scan.nextInt();
        System.out.println("bir sayi daha sayi giriniz :  ");
        int sayi2=scan.nextInt();
        //int bolum=sayi1/sayi2;
        try {
            int bolum = sayi1 / sayi2;
            System.out.println("bolum = " + bolum);

        }catch (ArithmeticException e){
            System.out.println("1.catch blokk...");
            System.out.println("lutfen 2. sayiyi 0 girmeyiniz"+e.getMessage());
        }
        catch (ArrayIndexOutOfBoundsException e){
            System.out.println("2.catch blok");
        }
        catch (Exception e){
            System.out.println("en baba catch ten selamlar");
        }
        finally {
            System.out.println("ne olusan ol yinede gel..");
        }



        System.out.println("bu ciktiyi okudu isen app basarili");
    }
}
