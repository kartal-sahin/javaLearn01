package J07_StringManipulation.tasks;

import java.util.Scanner;

public class Task01 {
    public static void main(String[] args) {
        // Task->  Girilen  bir stringde boşluk karakterinin olup olmadığını kontrol eden code create ediniz
        Scanner scanner = new Scanner(System.in);
        System.out.println("Lütfen bir string giriniz");
        String str = scanner.nextLine();
        if(str.contains(" ")){
            System.out.println("bosluk karakteri var");
        }else{
            System.out.println("bosluk karakteri yok");
        }


    }
}

