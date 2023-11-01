package J09_Break_Continue;

import java.util.Scanner;

public class C03_AsalControl {
    public static void main(String[] args) {
        //girilrn sayinin asal olup olmadigini kontrol ediniz.
        Scanner input=new Scanner(System.in);
        System.out.println("Lutfen bir tam sayi yaziniz");
        int sayi= input.nextInt();
        boolean asalMi=true;
        for (int i = 2; i <sayi ; i++) {
            if(sayi%i==0){
                asalMi=false;
                break;
            }

        }
        System.out.println(asalMi ? "girirlen sayi asal  " + sayi : "girilen sayi asal degil  " + sayi);


    }



}
