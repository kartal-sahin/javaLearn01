package J06_SwitchStatement.tasks;

import java.util.Scanner;
//girilen haftanin gununu hafta ici ya da hafta sonu oldugunu print eden code create ediniz.
public class C06_SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir gun ismi yaziniz");
        String gun= input.next().toLowerCase();
        switch (gun) {
            case "pazartesi":
            case "sali":
            case "carsamba":
            case "persembe":
            case "cuma":
                System.out.println("hafta ici ");
                break;
            case "cumartesi":
            case "pazar":
                System.out.println("hafta sonu");
                break;
            default:
                System.out.println("Lutfen dogru bir gun ismi yaziniz");
                break;

        }






    }

}
