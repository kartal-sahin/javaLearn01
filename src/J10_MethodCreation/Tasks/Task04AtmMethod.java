package J10_MethodCreation.Tasks;


import java.util.Scanner;

public class Task04AtmMethod {//amele koyu
    static int bakiye=1000;
    static Scanner input=new Scanner(System.in);
    public static void anaMenu(){

        System.out.println("isleminizi seciniz");
        int islemTercihi= input.nextInt();
        switch (islemTercihi){
            case 0:
                cikis();
               break;
            case 1:
                bakiyeSorgu();
               //anaMenu(); bad practice

                break;
            case 2:
                paraCek();
                break;
            case 3:
                paraYatir();
                break;
            default:
                System.out.println("dogru tercih giriniz");
                anaMenu();


        }


    }

    private static void paraYatir() {
        System.out.println("ne kadar para yatiracaksiniz?");
        int miktar= input.nextInt();
        bakiye+=miktar;
        System.out.println("basarili yeni bakiyeniz"+bakiye +"$\n ana menuye yonlendiriliyorsunuz.");
        anaMenu();
    }

    private static void paraCek() {
        System.out.print("ne kadar cekmek istiyorsunuz  :");
        int miktar= input.nextInt();
        System.out.println(bakiye < miktar ? "bakiye miktardan az" : "kalan bakiyeniz"+(bakiye -= miktar));
        bakiyeSorgu();


    }

    private static void bakiyeSorgu() {
        System.out.println("merhaba bakiyeniz  " + bakiye + "$");
        girisEkran();

    }

    private static void cikis() {
        System.out.println("cikisiniz basarili \nyine bekleriz");
    }

    public static void girisEkran(){
        System.out.println(" ***** cerkez banka welcome *******  \n" +
                "islem menusu: \n" +
                "bakiye sorgu->1\npara cekme->2\npara yatirma->3\ncikis->0" );
        anaMenu();
    }
}
