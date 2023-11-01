package J07_StringManipulation;

public class C12_replace_replaceAll {
    public static void main(String[] args) {
        /** replace()
         * Metin icerisindeki karakter ya da bir parcasinin, istenilen karakter ya da metinle degistirilmesini
         * (update -set) saglar. Sonuc String'dir..
         *
         */
        String str="ramazan";
        System.out.println(str.replace("a","*"));
        //System.out.println(str.replace((str.indexOf(0, str.length()-1), "*"));
       // str.replaceAll()
//(Regular Expressions)
//   \\s bosluk
//   \\S bosluk disindaki tum karakterler
//   \\w harfler ve rakamlar (a z A Z, 0 9)
//   \\W harfler ve rakamlar disindaki tum karakterler
//   \\d rakamlar 0 9
//   \\D rakamlar disindaki tum karakterler
        // replaceAll() method u replace() methoduna benzer ama 2 fark vardır
//1-replace() methodu char kabul eder ama replaceAll kabul etmez
//2-replaceAll() method u regex kullanımına izin verir (Regular Expressions)

       /* str= "javaCAN'lara selam bolcana 123456780232 § $ # £ offer :) ";
        System.out.println(str.replaceAll("\\s", "*"));
        System.out.println(str.replaceAll("\\S", "*"));
        System.out.println(str.replaceAll("\\w", "*"));
        System.out.println(str.replaceAll("\\W", "*"));
        System.out.println(str.replaceAll("\\d", "*"));
        System.out.println(str.replaceAll("\\D", "*"));

        */
        System.out.println(str.replaceAll("\\w", "*"));


    }
}
