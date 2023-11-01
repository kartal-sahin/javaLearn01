package J07_StringManipulation;

import java.util.Scanner;

public class C10_indexof_LastIndexof {
    public static void main(String[] args) {
 /* indexOf()
   char karakter ya da String metnin kacinci indexden basladigini veren bir method dur. Sonuc integer dir.
   Bu method index'i sorulan char'in String icindeki ilk gorunumunun index'ini return eder
   contains den farkı indexini verir, contains ise true false
 */
        //String str = "madem gelding dünyaya otor çalış JAVA'ya :";
        /*System.out.println(str.indexOf("a"));
        System.out.println(str.indexOf("J"));
        System.out.println(str.indexOf("JAVA"));
//olmayan karakter icin -1 ciktisi veriri..
//birden cok karakterde ilk karakterin indexini return eder..
        System.out.println(str.lastIndexOf("a"));
        System.out.println(str.lastIndexOf("y")
        System.out.println(str.lastIndexOf("JAVA"));
        System.out.println(str.indexOf("a",str.indexOf("a")));

         */
        Scanner input=new Scanner(System.in);
        System.out.println("Lütfen bir cumle yaziniz:");
        String cumle=input.nextLine();
        if (cumle.indexOf("java")==-1){
            System.out.println("Bir java var");
        }else if(cumle.indexOf("java")==cumle.lastIndexOf("java")){
            System.out.println("hic java yok");
        }else{
            System.out.println("birden cok java var");
        }








    }
}
