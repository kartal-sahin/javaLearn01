package J09_Break_Continue;

import java.util.Scanner;

public class C01_Break {
    public static void main(String[] args) {
     /*
break loop'u istenen yerden sonlandırmak için döngüyü kontrol edebiliriz.Bir loop'u, loop'un koşul bölümüne bağlı
kalmaksızın sona erdirmek için break komutu kullanılır. break komutu loop'a bağlı kod bloğunun
 herhangi bir işlem satırında yer alabilir. Program kod bloğunda break komutu'nu görür görmez,
 loop başlangıç koşulu sağlanmış olsa bile, loop'dan çıkar ve loop'dan sonra gelen ilk işlem
 satırından çalışmasına devam eder. İç içe(nested) looplarda break komutu kullanıldığında sadece
  içinde kullanıldığı loop'dan çıkışı sağlar:


 temelde döngüden atlamak için kullanılır, çoğunlukla if-else deyimi ile kullanılır
 */

        //girilen bir mail hesabi @ karakterine kadar olan karakterleri code creat ediniz
        //sahinkartal863s@gmail.com
        Scanner input=new Scanner(System.in);
        System.out.println("mail adresinizi giriniz :");
        String str=input.nextLine();
       // for (int i =0 ; i <str.length() ; i++) {
       //     if (str.charAt(i)=='@')break;
       //     System.out.print(str.charAt(i));

       // }
        System.out.println("*********************");
        String str1=str.substring(0,str.charAt('@'));
        System.out.println(str1);


    }
}
