package J11_Arrays;

public class _11_Average_of_Array {

    public static void main(String[] args) {

        /*
        int Array oluşturun ve elemanları : 12, 14 , 21 ,23 , 10 ,4
        Array'in ortalamasını alınız.
         */

        //Kodu aşağıya yazınız.
        int numArr[]={12, 14 , 21 ,23 , 10 ,4,6,12};
        System.out.println("ortalama = " + ortalama(numArr));
    }
    private static float ortalama(int[] numArr) {
        int toplam=0;
        for (int i = 0; i <numArr.length ; i++) {
            toplam+=numArr[i];
        }
        float ortala=toplam/numArr.length;

        return ortala;
    }
}