package J06_SwitchStatement.tasks;

import java.util.Scanner;

public class C03_SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen bir ay numarasi giriniz :");
        int ayNo= input.nextInt();

        switch ( ayNo ) {
            case 1:
            case 3:
            case 5:
            case 7:
            case 8:
            case 10:
            case 12:
                System.out.println("girilen ay 31 gun icerir");
                break;
            case 11:
            case 9:
            case 6:
            case 4:
                System.out.println("girilen ay 30 gun icerir");
                break;
            case 2:
                System.out.println("lutfen yil giriniz  :");
                int yil=input.nextInt();
                if(yil%4==0){
                    System.out.println("girilen ay 29 gun icerir");
                }else{
                    System.out.println("girilen ay 28 gun icerir");
                }
                break;
            default:
                System.out.println("Lutfen dogru bir ay numarasi giriniz");
                break;
        }
    }

}
