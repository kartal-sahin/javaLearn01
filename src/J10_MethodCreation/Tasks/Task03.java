package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task03 {
    static  Scanner input = new Scanner(System.in);
    public static void main(String[] args) {
        //task-> girilen Saati saniyeye mil'i km'ye kg'yi gr'a çeviren METHOD create ediniz.
       // Scanner input = new Scanner(System.in);
        //System.out.println("cevirilecek birimi giriniz");
        //String birim= input.next().toLowerCase();
        //System.out.println("cevirilecek birimin miktarini giriniz");
        //double miktar= input.nextDouble();

        donustur(birimVer(),miktarVer());




    }//main sonu

    private static void donustur(String birim, double miktar) {
        switch(birim) {
            case "saat":
                saatSaniye(miktar);//System.out.println(miktar+" saatin saniye degeri"+ (miktar*3600));

                break;
            case "mil" :
               milKm(miktar); //System.out.println(miktar+" milin km degeri degeri"+ (miktar*1.6));
                break;
            case "kg" :
                kgGram(miktar);//System.out.println(miktar+" kg nin gram degeri degeri"+ (miktar*1000));

                break;
            default:
                System.out.println("hatali giris");
        }
    }

    private static void kgGram(double miktar) {
        System.out.println(miktar+"    kg nin gram degeri degeri   "+ (miktar*1000));
    }

    private static void milKm(double miktar) {
        System.out.println(miktar+"   milin km degeri degeri  "+ (miktar*1.6));
    }

    private static void saatSaniye(double miktar) {
        System.out.println(miktar+"    saatin saniye degeri   "+ (miktar*3600));
    }
public static String birimVer(){
    System.out.println("cevirilecek birimi giriniz   :" );
    String birim= input.next().toLowerCase();
    return birim;
}
public static double miktarVer(){
    System.out.println("cevirilecek birimin miktarini giriniz  :  ");
    double miktar= input.nextDouble();
    return miktar;
}
}// Class sonu
