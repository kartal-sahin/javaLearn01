package J14_Varargs;

public class C02_ {
    public static void main(String[] args) {
        int arr[]={10,11,12};
        System.out.println(arrSum(arr));
        System.out.println( varargsSum(arr));

    }

    private static int varargsSum(int...i) {
        int toplam=0;
        for(int avuc:i){
            toplam+=avuc;
        }
        return toplam;

    }

    private static int arrSum(int[] arr) {
        int toplam=0;
        for(int avuc:arr){
            toplam+=avuc;
        }
        return toplam;
    }
}
