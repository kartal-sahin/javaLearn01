package J09_Break_Continue;

import java.util.Scanner;

public class C04_PinControl {
    public static void main(String[] args) {
        // Task -> Girilen String data type bir pin datasının 3 giriş hakkında kontrol eden code create ediniz.
        Scanner input=new Scanner(System.in);

        String pin="javvaNur";
        int girisHkki=3;
        while (true){
            System.out.println("bir pin giriniz");
            String pin1= input.nextLine();
            if(pin1.equals(pin)){
                System.out.println(" dogru pin tamam oldu");
                break;
            }else{
                System.out.println("hatali pin");
                girisHkki--;
                System.out.println(girisHkki + "hakkin kaldi");
                if(girisHkki==0){
                    System.out.println("giris hakkiniz kalmadi");
                    break;

                }            }


        }






    }
}
