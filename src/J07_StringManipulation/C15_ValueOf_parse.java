package J07_StringManipulation;

public class C15_ValueOf_parse {
    public static void main(String[] args) {
        /*
 Integer.valueOf() rakamlarla olusturulan String'leri sayiya donusturur. Boylece rakamlarla olusturulan
 Stringlerle matematiksel islemler yapabilmemizi saglar.

valueOf(); meth hem Integer wrapper  hem de String Class'da bulunur. Integer wrapper Class
 valueOf() methdou String'i integer'a  String Class valueOf() methodu integer'i String'e cevirir.
 */

// task -> string type verilen iki adet bagıs miktarını toplayan code create ediniz..

        String b1="10000";
        String b2="12000";
        int yeniB1=Integer.valueOf(b1);
        int yeniB2=Integer.valueOf(b2);
        System.out.println( "bagis toplami : "+(yeniB1+yeniB2));

        int tc=987654321;
        String str=String.valueOf(tc);
        System.out.println(str);
        System.out.println();
        System.out.println(tc);
        System.out.println();
        System.out.println(tc + str);
        System.out.println();
         /*
Task-> String strA="$13.99"  String strB="$17.55" parse method kullanarak strA+strB toplamını print den code create ediniz
   output: strA+strB=31.54
     */
        String strA="$13.99";
        String strB="$17.55";
        Double yeniA=Double.valueOf(strA.substring(1));
        Double yeniB=Double.valueOf(strB.substring(1));
        System.out.println(yeniB + yeniA);
        System.out.println();
        int yeniAA=Integer.valueOf(strA.replaceAll("\\D",""));
        int yeniBB=Integer.valueOf(strB.replaceAll("\\D",""));
        System.out.println(yeniAA + yeniBB);
        System.out.println();
        int yeniA2=Integer.parseInt(strA.replaceAll("\\D",""));
        int yeniB3=Integer.parseInt(strB.replaceAll("\\D",""));
        System.out.println(yeniAA + yeniBB);
        System.out.println();



    }
}
