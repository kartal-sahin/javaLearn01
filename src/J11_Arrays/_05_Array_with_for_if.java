package J11_Arrays;

public class _05_Array_with_for_if {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 5,6,8,12,14,19
        Eğer sayı çiftse topla, tekse çıkar.
        Örneğin:
         -5 + 6 + 8 + 12 + 14 - 19 = 16
        Toplamlarını yazdırın.
         */

        //Kodu aşağıya yazınız.
        int toplam=0;
        int numArr[]={5,6,8,12,14,19};
        for (int i = 0; i < numArr.length ; i++) {
           /* if (numArr[i] % 2 == 0) {
                toplam+=numArr[i];
                }else toplam-=numArr[i];

            */
            toplam=(numArr[i] % 2 == 0)?(toplam+=numArr[i]):(toplam-=numArr[i]);
            }
        System.out.println("toplam = " + toplam);
        }
}
