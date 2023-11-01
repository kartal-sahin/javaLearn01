package J05_ifStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task15 {
    public static void main(String[] args) {
         /*
          TASK -> Kullanıcının ehliyetinin varlığını kontrol ediniz.
          Ehliyeti varsa yıl tecrübesi 7 yıl ve üstü ise aldıgı mesafe 100000 km ve üzeri ise kontak anahtarını veriniz
          aksi durumda tecrübe yılı ve mesafe eksiklerini print eden code create ediniz
         */
        Scanner input = new Scanner(System.in);

        System.out.println("agam ehliyetin var ise E yoğğğ ise H giresen : ");

        int ehliyetVarligi = input.nextInt();


        if(ehliyetVarligi==1)   {
            System.out.println("lutfen tecrube yilinizi giriniz");
            int tecrube = input.nextInt();

            if(tecrube>=7){
                System.out.println("km gir");
                int km = input.nextInt();
                if(km>=100000){
                    System.out.println("kontagi alabilirsiniz");
                }else{
                    System.out.println("kontagi alman icin "+(100000-km) +"daha km ye ihtiyacin var");
                }


            }else{
                System.out.println("7 yil tecrube yok");
                System.out.println("kontak alman icin "+ (7-tecrube)  + "  yila daha  ihtiyacin var);");

            }



        }else if(ehliyetVarligi==0){
            System.out.println("Ehliyet almadiginiz icin anahtari veremiyorum..");

        }else{
            System.out.println("Lutfen dogru giris yapiniz...");
        }






    }
}
