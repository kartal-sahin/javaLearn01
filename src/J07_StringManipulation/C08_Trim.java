package J07_StringManipulation;

public class C08_Trim {
    public static void main(String[] args) {
     /*
trim()-> İstediğimiz String'in başında veya sonunda varolan boşluk (space)'leri temizler.

       */
        String str="   ne yapisen gardas   ):   ";
        System.out.println(str.length());
        System.out.println(str);
        System.out.println(str.trim().length());
        System.out.println(str.trim());

    }
}
