package J06_SwitchStatement.tasks;

import java.util.Scanner;

public class C05_SwitchCase {
    public static void main(String[] args) {
        Scanner input=new Scanner(System.in);
        System.out.println(" \nBakiye icin --> 1 \nYatirma icin --> 2 \nCekme icin --> 3 \nCikis icin --> 4\n Lutfen tercihinizi giriniz  :  ");
        int secim=input.nextInt();

        int bakiyeMIk=1000;
        switch (secim) {
            case 1:
                System.out.println("Bakiyeniz :"+bakiyeMIk +"$");
                break;
            case 2:
                System.out.println("Lutfen yatirmak istediginiz miktari giriniz :");
                int miktari=input.nextInt();
                bakiyeMIk+=miktari;
                System.out.println("Yatirma islemi gerceklesti.kalan bakiyeniz :"+bakiyeMIk);
                break;
            case 3:
                System.out.println("ne kadar para cekmek istediginiz giriniz:");
                int para=input.nextInt();
                  if(para<=bakiyeMIk){
                     bakiyeMIk-=para;
                     System.out.println("Cekme islemi gerceklesti.yeni bakiyeniz :"+bakiyeMIk);
                  }else{
                     System.out.println("bakiyeniz yetersiz");
                  }

                break;
            case 4:
                System.out.println("cikis yaptiniz iyi gunlerde gorusmek uzere");
                break;
            default:
                System.out.println("Lutfen dogru bir secim giriniz");
                break;
        }


    }

}
