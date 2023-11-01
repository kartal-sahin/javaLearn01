package J10_MethodCreation.Tasks;

import java.util.Scanner;

public class Task13 {
     static  Scanner input= new Scanner(System.in);

    public static void main(String[] args) {

    /*
    Task-> girilen iki String'den ikincisi, birincisinin son harflerine eşitse, true, diğer durumda false return eden METHOD create ediniz

    Örnekler:
   ("abc", "bc") ➞ true
   ("abc", "d") ➞ false
   ("samurai", "zi") ➞ false
   ("feminine", "nine") ➞ true
   ("convention", "tio") ➞ false
    */

        //String x = "feminine";
       // String y = "nine";
       // String z = "tio";
       // estMi(x, y, z);
        System.out.println("lutfen bır kelime yazınız :");
        String str1= input.next();
        System.out.println("lutfen bır kelime daha yazınız :");
        String str2= input.next();

        karsilastir(str1, str2);
        System.out.println(karsilastir(str1, str2));


    }//main sonu

    private static String karsilastir(String str1, String str2) {
        if(str1.substring(str1.length() -3).equals(str2.substring(str2.length() -3))?true:false){
            System.out.println("true");
        } else if (str1.substring(str1.length() -2).equals(str2.substring(str2.length() -2))?true:false) {
            System.out.println("true");

        } else if (str1.substring(str1.length() -1).equals(str2.substring(str2.length() -1))?true:false) {
            System.out.println("true");

        }else {
            System.out.println("false");
        }
        return "true";
    }




}//Class sonu
