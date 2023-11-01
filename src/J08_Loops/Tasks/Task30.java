package J08_Loops.Tasks;

import java.util.Scanner;

public class Task30 {

    public static void main(String[] args) {
        // task-> girilen iki tamsayı arasındaki tamsayıların toplamını print eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("tamsayi giriniz");
        int sayi1=scanner.nextInt();
        System.out.println("2.tamsayi giriniz");
        int sayi2=scanner.nextInt();
        int toplam=0;
        for (int i = (sayi1<sayi2?sayi1+1:sayi2+1); i < (sayi2<sayi1?sayi1:sayi2); i++) {
            toplam+=i;



        }
        System.out.println(toplam);


    }
}
