package J14_Varargs;

public class Tasks002 {
    /*
Task ->
Girilen ilk sayı hariç diğerlerini toplayan ve toplam ile ilk sayıyı çarpan METHOD create ediniz.

 */
    public static void main(String[] args) {
        int sayiArr[] = {2,24, 23, 38, 33, 21, 59, 26, 10};
        System.out.println(varTopCArp(2, 24, 23, 38, 33, 21, 59, 26, 10));
    }

    private static int varTopCArp(int i,int...i1) {
        int toplam=0;

        for(int avuc:i1) {
            toplam+=avuc;
        }
        return i*toplam;

    }

}
