package J08_Loops.Tasks;

import java.util.Scanner;

public class Task10 {

    public static void main(String[] args) {
        /* task ->
        girilen bir ifadenin istenen harf sayısını print eden code create ediniz

        input : selam javaCAN'lar
        output : a sayısı :3
         */
        Scanner input=new Scanner(System.in);
        System.out.println("lutfen birseyler yaziniz");
        String str=input.nextLine();
        int harfSayisi=0;
        char harf=input.next().charAt(0);
        for (int i = 0; i <str.length() ; i++) {
            if(str.charAt(i)==harf) {
                harfSayisi++;

            }

        }

        System.out.println(harfSayisi);


    }
}
