package J11_Arrays;

public class _15_Word_Count {

    public static void main(String[] args) {

        /*
        Bu String'i oluşturun. "Removes white space from both ends of a string"
        String'deki kelime sayısını yazdırınız.
         */

        //Kodu aşağıya yazınız.
        String str="Removes white space from both ends of a string";
        String strArr[]=str.split(" ");
        System.out.println("verilen cumlenin kelime sayisi = " +strArr.length);


    }
}