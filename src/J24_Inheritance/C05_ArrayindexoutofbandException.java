package J24_Inheritance;

public class C05_ArrayindexoutofbandException {
    public static void main(String[] args) {
        int arr[] = {1, 2, 3, 4, 5, 6, 7, 8, 9};
        System.out.println("arr[2] = " + arr[2]);
        try {
            System.out.println("arr[12] = " + arr[12]);
        } catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("naber catch calsiti");
        }
        System.out.println("ver elini baska kodlar...");
    }
}
