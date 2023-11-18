package J14_Varargs.Tasks;

import java.util.Scanner;

public class Task04 {
    static Scanner scan=new Scanner(System.in);
    public static void main(String[] args) {
        /* Task->
    stringlerin istenilen kadar ilk harflerini yazdıran METHOD create ediniz.
*/
        System.out.print("Lutfen bir kelime giriniz : ");
        String str= scan.nextLine();
        String strArr[]=str.split("");
        String strArr3[] = {"h", "a", "l", "u", "k"};
        String strArr4[] = {"a", "l", "i"};
        System.out.println("ilk kac karakteri yazilsin : ");
        int sayi= scan.nextInt();


        ilkHarf(sayi, strArr);


    }

    private static void ilkHarf(int i, String[]...str) {

        /*for (int j = 0; j <str.length ; j++) {
            String bosStr="";
            for (int k = 0; k <str[j].length ; k++) {
                bosStr += str[j][k];

            }

            System.out.print(bosStr.substring(0,i)+ " ");
        }

         */
        String bosStr="";
        for(String[] avuc:str){
            for(String  avuc2:avuc){
                bosStr +=avuc2;

            }

        }
        System.out.print(bosStr.substring(0,i)+ " ");
    }

}
