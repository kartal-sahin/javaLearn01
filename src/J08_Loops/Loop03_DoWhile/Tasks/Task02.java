package J08_Loops.Loop03_DoWhile.Tasks;

import java.util.Scanner;

public class Task02 {

    public static void main(String[] args) {
        //Task-> girilen baslangic ve bitis karakterleri dahil
        // aradaki tum karakterleri prnt eden code create ediniz

        Scanner input=new Scanner(System.in);
       /* String str;
        String str1;
        int i=0;
        do {
            System.out.println("lutfen bir string giriniz :");
            str1= input.nextLine();
            str=str1.substring(1,str1.length());
        }while(i<1);
        System.out.println("str = " + str);

        */
        char startChar;
        char endChar;
        System.out.println("baslama charctar giriniz");
        startChar=input.next().charAt(0);
        System.out.println("bitis karakter giriniz");
        endChar=input.next().charAt(0);

        do {
            System.out.print(startChar + " ");
            startChar=(char)(startChar+1);


        }while(startChar<=endChar);


    }
}
