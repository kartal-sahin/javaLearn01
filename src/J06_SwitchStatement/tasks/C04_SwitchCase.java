package J06_SwitchStatement.tasks;

import java.util.Scanner;

public class C04_SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.print("Lutfen bir ay numarasi giriniz :");
        int ayNo= input.nextInt();
//case 1,2,3: seklindede calisir...ama jkd 14 de 11 de olmuyor...
        switch ( ayNo ) {
            case 12:
            case 1:
            case 2:
                System.out.println("mevsimlerden kis");
                break;
            case 3:
            case 4:
            case 5:
                System.out.println("Mevsimlerden ilkbahar");
                break;
            case 6:
            case 7:
            case 8:
                System.out.println("Mevsimlerden yaz");
                break;
            case 9:
            case 10:
            case 11:
                System.out.println("Mevsimlerden sonbahar");
                break;

            default:
                System.out.println("Lutfen dogru bir ay numarasi giriniz");
                break;
        }
    }

}
