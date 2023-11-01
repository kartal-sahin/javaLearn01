package J01_Variables;

import java.util.Scanner;

public class C01_game {
    static Scanner input=new Scanner(System.in);
    public static String str1="";
    public static String str2="";
    public static int player1Score=0;
    public static int player2Score=0;
    public static int playerCount = 0;
    public static String decision;
    public static String continueDecision;
    public static String concatDecision;

    public static void main(String[] args) {
        System.out.println("1. ouyuncu Lutfen bir kelime giriniz");
        String str1=input.nextLine();

        System.out.println("2.oyuncu lutfen bir cevap giriniz :");
        String str2=input.nextLine();
        System.out.println(ikinciyeSor(str1,str2));



    }//main sonu

    private static Object ikinciyeSor(String str1, String str2) {
        if(str2.equals("evet")){
            player1Score+=str1.length();


        }else{
            System.out.println(("oyun bitti puaniniz"+(player1Score+=str1.length())));

        }
        return player1Score;

    }


}//class sonu
