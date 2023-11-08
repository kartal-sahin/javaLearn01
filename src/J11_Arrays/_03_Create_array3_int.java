package J11_Arrays;

public class _03_Create_array3_int {

    public static void main(String[] args) {

    /*    İnt Array oluştur ve elemanları   : 25,30,30,35,100
          Array in elemanlarının toplamını yazdır.
          Cevap 220 olmalı.
     */

        //Kodu aşağıya yazınız..
        int toplam=0;
        int numArr[]={25,30,30,35,100};
        for (int i = 0; i < numArr.length ; i++) {
            toplam+=numArr[i];
        }
        System.out.println("toplam = " + toplam);

    }
}