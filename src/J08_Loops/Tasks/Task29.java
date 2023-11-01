package J08_Loops.Tasks;

import java.util.Scanner;

public class Task29 {

    public static void main(String[] args) {
        // task-> girilen bir Stringde  index'i tek sayi olanlari kucuk harfle
        // index'i cift sayi olanlari buyuk harfle print eden code create ediniz
        // ornek : Haluk  output: HaLuK
        Scanner input=new Scanner(System.in);
        System.out.println(" bir cumle yaziniz");
        String cumle=input.nextLine().replace(" ","");
        String str="";
        String str2="";

        for (int i = 0; i <cumle.length() ; i++) {
            if (i%2==0){
                str=cumle.substring(i,i+1).toUpperCase();
            }else {
                str2=cumle.toLowerCase();
                // System.out.print((i % 2 == 0) ? cumle.substring(i, i + 1).toUpperCase() :  cumle.substring(i, i + 1).toLowerCase());
            }
            System.out.print(str + " " + str2);

        }




    }
}
