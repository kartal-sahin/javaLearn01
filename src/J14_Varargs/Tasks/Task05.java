package J14_Varargs.Tasks;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

public class Task05 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        /*
        Bir okuldaki ogrencilerden ders secmesi isteniyor.
        Alınann ders saati sayısının 12'yi gecmemesi isteniyor.
        Buna gore;
        Asagida ders saatleri verilen derslerden istenildiği kadar seçildiğinde
         ders saatleri toplamı 12'yi gecerse "AGAM Limiti astiniz";
        12'yi gecmezse "AGAM gayet başarılı :)" print eden METHOD create ediniz
        Matematik :4 saat
        Geometri : 2 saat
        Fizik : 3 saat
        Kimya : 3 saat
        Biyoloji : 3 saat
        Edebiyat : 2 saat
        Tarih : 2 saat
        Cografya : 2 saat

         */
//        System.out.println("lutfen secmek istediginiz derslei giriniz yaziniz\nmatematik icin --> 1\ncografya icin --> 2\ngeometri icin --> 3\nfizik icin --> 4\nkimya icin --> 5\nbiyoloji icin --> 6\nedebiyat icin --> 7\ntarih icin --> 8\n cikmak icin --> tamam tuslayiniz   :   ");
//        for (int i = 0; i < 9; i++) {
//            int ders = scan.nextInt();
//        if (ders==0) break;
        List<Integer> dersler=new ArrayList<Integer>();
           int Matematik = 4;
           dersler.add(Matematik);
            int Geometri = 2;
        dersler.add(Geometri);
            int Fizik = 3;
        dersler.add(Fizik);
            int Kimya = 3;
        dersler.add(Kimya);
            int Biyoloji = 3;
        dersler.add(Biyoloji);
            int Edebiyat = 2;
        dersler.add(Edebiyat);
            int Tarih = 2;
        dersler.add(Tarih);
            int Cografya = 2;
        dersler.add(Cografya);

            dersSecimi(dersler);


    }

    private static void dersSecimi(List<Integer> dersSecimi) {
        int toplam = 0;
        for (int avuc : dersSecimi) {
            toplam += avuc;

            if (toplam <= 12) {
                System.out.println("secim basarili");

            }else System.out.println("fazla ders sectiniz");
        }
        System.out.println(+toplam);

    }


}
