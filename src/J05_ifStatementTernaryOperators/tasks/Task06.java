package J05_ifStatementTernaryOperators.tasks;

import java.util.Scanner;

public class Task06 {

    public static void main(String[] args) {
		/* Task->
		 Kullanıcıdan cinsiyetini girmesini isteyin.
		Erkek ise yaşını kontrol edin. Yaşı 18 den küçük ise ekrana “Erkek çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Adam” yazdırın.
		Kadin ise yasini kontrol edin. Yaşı 18 den küçük ise ekrana “Kız çocuk” yazdırın.
		Yaşı 18 den büyük eşit ise ekrana “Kadın” yazdırın.
		 */
        Scanner input = new Scanner(System.in);
        System.out.print("agam cinsiyetini giresen : ");
        String cnsyt= input.next();
        System.out.print("agam yasını giresen : ");
        int agaYası = input.nextInt();
        if(cnsyt.equalsIgnoreCase("erkek")){
            if(agaYası<18){
                System.out.println("Erkek çocuk");
            }else{
                System.out.println("Adam");
            }
        }else if(cnsyt.equalsIgnoreCase("kadin")){
            if(agaYası<18){
                System.out.println("Kız çocuk");
            }else {
                System.out.println("Kadın");
            }

        }
        System.out.println("lutfen dogru giris yapiniz");
    }




}
