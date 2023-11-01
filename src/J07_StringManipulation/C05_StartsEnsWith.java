package J07_StringManipulation;

public class C05_StartsEnsWith {
    public static void main(String[] args) {
        //Startwith-> metnin bas kisminin istenilen dizi ile eslenip eslemedigini kontrol eder boolean return eder
        //endsWith-> metnin bason kisminin istenilen dizi ile eslenip eslemedigini kontrol eder boolean return eder
        String str="string icerisinde istenen stringin varligini kontrol eder boolean return eder";
        System.out.println(str.startsWith("string"));
        System.out.println(str.endsWith("string"));
    }
}
